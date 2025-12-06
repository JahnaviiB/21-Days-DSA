package Day16;

public class HouseRobber {
    public static int maxrobbedmoney(int[] nums){
       if(nums == null || nums.length == 0) return 0;
       if(nums.length == 1) return nums[0];
       if(nums.length == 2) return Math.max(nums[0],nums[1]);

       int[] dp = new int[nums.length];
       dp[0] = nums[0];
       dp[1] = Math.max(nums[0],nums[1]);
       for(int i = 2;i<=nums.length-1;i++){
           dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
       }
       return dp[nums.length - 1];
    }
    public static void main(String[] args){
        int[] input = {2,7,9,3,1};
        int output = maxrobbedmoney(input);
        System.out.println(output);
    }
}
