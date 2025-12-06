package Day8;

public class FinMinInRotatedSortedArray {
    public static int mininrotatedarray(int[] nums){
        if(nums.length == 1) return nums[0];
        int left = 0, right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args){
        int[] input = {4,5,6,7,0,1,2};
        int output = mininrotatedarray(input);
        System.out.println(output);
    }
}
