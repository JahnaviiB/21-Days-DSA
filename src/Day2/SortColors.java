package Day2;

import java.util.Arrays;

public class SortColors {
    public static int[] colorsorted(int[] nums){
        int target = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[target];
                nums[target] = temp;
                target++;
            }
        }
        for(int i=target;i<nums.length;i++){
            if(nums[i] == 1){
                int temp = nums[i];
                nums[i] = nums[target];
                nums[target] = temp;
                target++;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] input = {2,0,2,1,1,0};
        int[] output = colorsorted(input);
        System.out.println(Arrays.toString(output));
    }
}
