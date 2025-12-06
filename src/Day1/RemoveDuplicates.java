package Day1;

public class RemoveDuplicates {
    public static int duplicateremove(int[] nums){
        if(nums.length == 0) return 0;
        int count = 1;
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        int output = duplicateremove(input);
        System.out.println(output);
        for(int k=0;k<output;k++){
            System.out.println(input[k]+" ");
        }
    }
}
