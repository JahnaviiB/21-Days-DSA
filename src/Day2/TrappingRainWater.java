package Day2;

public class TrappingRainWater {
    public static int totalrainwater(int[] height){
        int left = 0, right = height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];
        int result = 0;
        while(left < right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax,height[left]);
                result += leftMax - height[left];
            }else{
                right--;
                rightMax = Math.max(rightMax,height[right]);
                result += rightMax - height[right];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] input_height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int output = totalrainwater(input_height);
        System.out.println(output);
    }
}
