package Day5;

import java.util.HashMap;
import java.util.Map;

public class MaxSizeSubArraySumK {
    public static int subarraysumk(int[] nums,int k){
        int prefix=0,longest=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            prefix += nums[i];
            int need = prefix - k;
            if(map.containsKey(need)){
                int j = map.get(need);
                int length = i - j;
                longest = Math.max(longest,length);
            }
            map.putIfAbsent(prefix,i);
        }
        return longest;
    }
    public static void main(String[] args){
        int[] input = {1,-1,5,-2,3};
        int target = 3;
        int output = subarraysumk(input,target);
        System.out.println(output);
    }
}
