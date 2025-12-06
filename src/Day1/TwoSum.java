package Day1;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] totalsum(int[] nums,int k){
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
           int complement = k - nums[i];
           if(map.containsKey(complement)){
               return new int[]{map.get(complement),i};
           }
           map.put(nums[i],i);
       }
       return nums;
    }
    public static void main(String[] args){
        int[] input = {2,7,11,15};
        int target = 9;
        int[] output = totalsum(input,target);
        System.out.println(Arrays.toString(output));
    }
}
