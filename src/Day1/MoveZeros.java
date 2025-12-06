package Day1;

public class MoveZeros {
    public static int[] movingzeros(int[] nums){
        int i = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] input = {0,1,0,3,12};
        int[] output = movingzeros(input);
        for(int k=0;k<output.length;k++){
            System.out.println(output[k] + " ");
        }
    }
}
