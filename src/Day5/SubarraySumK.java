package Day5;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumK {
    public static int sumtok(int[] nums,int k){
        int prefix = 0, count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix += nums[i];
            int need = prefix - k;
            if(map.containsKey(need)){
                count += map.get(need);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        int[] input = {1,2,3};
        int targetsum = 3;
        int output = sumtok(input,targetsum);
        System.out.println(output);
    }
}
