package Day16;

public class DeleteAndEarn {
    public static int earnbydelete(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int max = 0;
        for(int num : nums){
            if(num > max) max = num;
        }

        int[] points = new int[max+1];
        for(int num : nums){
            points[num] += num;
        }
        if(max == 0) return 0;
        if(max == 1) return points[1];

        int[] dp = new int[max+1];
        dp[0] = 0;
        dp[1] = points[1];

        for(int i=2;i<=max;i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + points[i]);
        }
        return dp[max];
    }
    public static void main(String[] args){
        int[] input = {3,4,2};
        int output = earnbydelete(input);
        System.out.println(output);
    }
}
