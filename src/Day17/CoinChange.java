package Day17;

public class CoinChange {
    public static int totalcoints(int[] coins, int amount){
        if(amount == 0) return 0;
       int[] dp = new int[amount + 1];
       for(int i=1;i<=amount;i++){
           dp[i] = amount + 1;
       }
       dp[0] = 0;

       for(int coin : coins){
           for(int i=coin;i<= amount;i++){
               dp[i] = Math.min(dp[i], dp[i-coin] + 1);
           }
       }
       if(dp[amount] > amount){
           return -1;
       } else{
           return dp[amount];
       }
    }
    public static void main(String[] args){
        int[] input = {1,2,5};
        int total = 11;
        int output = totalcoints(input,total);
        System.out.println(output);
    }
}
