package Day7;

public class SearchInsertPosition {
    public static int insertposition(int[] nums,int k){
        int left = 0,right = nums.length - 1;
        while(left <= right){
                int mid = left + (right - left) / 2;
                if(nums[mid] == k) {
                    return mid;
                }
                else if(nums[mid] < k) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
        }
        return left;
    }
    public static void main(String[] args){
        int[] intput = {1,3,5,6};
        int target = 5;
        int output = insertposition(intput,target);
        System.out.println(output);
    }
}
