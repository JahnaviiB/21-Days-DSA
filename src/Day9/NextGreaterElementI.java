package Day9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
    public static int[] nextgreaterelement(int[] nums1,int[] nums2){
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> seen = new HashMap<>();
        for(int i=0;i< nums2.length;i++){
            while(!stack.isEmpty() && i > stack.peek()){
                int smaller = stack.pop();
                seen.put(smaller,i);
            }
            stack.push(i);
        }
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i] = seen.getOrDefault(nums1[i],-1);
        }
        return result;
    }
    public static void main(String[] args){
        int[] input1 = {4,1,2};
        int[] input2 = {1,3,4,2};
        int[] output = nextgreaterelement(input1,input2);
        System.out.println(Arrays.toString(output));
    }
}
