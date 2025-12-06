package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> sumofthree(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int left = i+1, right = nums.length-1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] input = {-1,0,1,2,-1,-4};
        List<List<Integer>> output = sumofthree(input);
        System.out.println(output);
    }
}
