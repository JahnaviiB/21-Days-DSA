package Day17;

import javax.sound.sampled.AudioSystem;

public class LongestCommonSubsequence {
    public static int lcs(int[] nums){
        if(nums.length == 0) return 0;
        int n = nums.length;
        int[] dp = new int[n];

        for(int i=0;i<n;i++){
            dp[i] = 1;
        }
        int max = 1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args){
        int[] input = {10,9,2,5,3,7,101,18};
        int output = lcs(input);
        System.out.println(output);
    }
}
