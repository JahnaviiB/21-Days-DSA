package Day1;

public class BestTimeToBuy {
    public static int buyandsellstock(int[] prices)
    {
        int minPrice=prices[0], maxPrice=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                int profit = prices[i] - minPrice;
                if(profit > maxPrice){
                    maxPrice = profit;
                }
            }
        }
        return maxPrice;
    }
    public static void main(String[] args){
        int[] input = {7,1,5,3,6,4};
        int output = buyandsellstock(input);
        System.out.println(output);
    }
}
