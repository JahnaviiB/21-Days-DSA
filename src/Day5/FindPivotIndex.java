package Day5;

import java.util.Arrays;

public class FindPivotIndex {
    public static int pivotindex(int[] nums){
        int leftsum = 0,total=0,rightsum=0;
        for(int n : nums) total += n;

        for(int i=0;i<nums.length;i++){
            rightsum = total - leftsum - nums[i];
            if(rightsum == leftsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int[] input = {1,7,3,6,5,6};
        int pivot = pivotindex(input);
        System.out.println(pivot);
    }
}
