package Day16;

public class MaxSubArray {
    public static int kadanesum(int[] nums){
        if(nums.length == 1) return nums[0];
        int currentSum = nums[0], maxSum = nums[0];
        for(int i=1;i<= nums.length-1;i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] input = {5,4,-1,7,8};
        int output = kadanesum(input);
        System.out.println(output);
    }
}
