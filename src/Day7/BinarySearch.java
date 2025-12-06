package Day7;

public class BinarySearch {
    public static int binarysearch(int[] nums,int k){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            for (int i=0;i<nums.length;i++){
                int mid = left + (right - left) / 2;
                if(nums[i] == k){
                    return i;
                }else if(nums[i] < k){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] input = {-1,0,3,5,9,12};
        int target = 9;
        int output = binarysearch(input,target);
        System.out.println(output);
    }
}
