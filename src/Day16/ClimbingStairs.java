package Day16;

public class ClimbingStairs {
    public static int stairsclimbed(int n){
        if(n == 1) return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[n] = dp[n-1] + dp[n-2];
        }
        return dp[n];
    }
    public static void main(String[] args){
        int input = 2;
        int output = stairsclimbed(input);
        System.out.println(output);
    }
}
