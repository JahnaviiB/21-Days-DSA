package Day8;

public class SearchInRotatedSortedArray {
    public static int searchinsortedarray(int[] nums,int k){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
           if(nums[mid] == k){
               return mid;
           }
           if(nums[left] <= nums[mid]){
               if(nums[left] <= k && k <= nums[mid]){
                   right = mid - 1;
               } else {
                   left = mid + 1;
               }
           } else{
               if(nums[mid] < k && k <= nums[right]){
                   left = mid + 1;
               } else {
                   right = mid - 1;
               }
           }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] input = {4,5,6,7,0,1,2};
        int target = 4;
        int output = searchinsortedarray(input,target);
        System.out.println(output);
    }
}
