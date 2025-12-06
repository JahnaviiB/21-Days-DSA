package Day8;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static int[] firstandlastposition(int[] nums, int k) {
        if(nums.length == 0) return new int[]{-1,-1};

        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= k){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        int first = left;

        if(first == nums.length || nums[first] != k){
            return new int[]{-1,-1};
        }

        right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] <= k){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        int last = right;

        return new int[]{first,last};
    }

    public static void main(String[] args){
        int[] input = {5,7,7,8,8,10};
        int target = 8;
        int[] output = firstandlastposition(input,target);
        System.out.println(Arrays.toString(output));
    }
}
