package Day2;

import java.util.Enumeration;

public class ContainerWithMostWater {
    public static int mostwater(int[] heights){
        int left = 0, right = heights.length-1;
        int maxArea = 0;

        while(left < right){
            int width = right  - left;
            int height = Math.min(heights[left],heights[right]);
            int area = width * height;
            maxArea = Math.max(maxArea,area);

            if(heights[left] < heights[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args){
        int[] input = {1,8,6,2,5,4,8,3,7};
        int output = mostwater(input);
        System.out.println(output);
    }
}
