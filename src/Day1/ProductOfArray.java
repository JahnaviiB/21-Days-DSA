package Day1;

import java.util.Arrays;

public class ProductOfArray {
    public static int[] arrayproduct(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        int prefix = 1;
        for(int i=0;i<n;i++){
            result[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for (int i=n-1;i>=0;i--){
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] input = {1,2,3,4};
        int[] output = arrayproduct(input);
       System.out.println(Arrays.toString(output));
    }
}
