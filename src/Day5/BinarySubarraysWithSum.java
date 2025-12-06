package Day5;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarraysWithSum {
    public static int subarraywithsum(int[] nums,int goal){
        int prefix = 0, count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix += nums[i];
            int need = prefix - goal;
            if(map.containsKey(need)){
                count += map.get(need);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        int[] input = {1,0,1,0,1};
        int target = 2;
        int output = subarraywithsum(input,target);
        System.out.println(output);
    }
}
