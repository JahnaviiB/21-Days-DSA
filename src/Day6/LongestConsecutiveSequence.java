package Day6;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int consecutivesequence(int[] nums){
        int maxcount = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
       for(int i=0;i<nums.length;i++){
           if(!set.contains(nums[i] - 1)){
               int current = nums[i];
               int count = 1;

               while (set.contains(current + 1)){
                   count++;
                   current++;
               }
               maxcount = Math.max(maxcount,count);
           }
       }
       return maxcount;
    }
    public static void main(String[] args){
        int[] input = {100,4,200,1,3,2};
        int output = consecutivesequence(input);
        System.out.println(output);
    }
}
