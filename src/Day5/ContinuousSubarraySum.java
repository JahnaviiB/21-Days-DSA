package Day5;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    public static boolean continuoussum(int[] nums,int k){
        int prefix = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            prefix += nums[i];
            int mod = nums[i] % k;

            if(map.containsKey(mod)){
                int prevIndex = map.get(mod);

                if(i - prevIndex >= 2) return true;
            }
            else {
                map.put(mod,i);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] input = {23,2,4,6,7};
        int target = 6;
        boolean output = continuoussum(input,target);
        System.out.println(output);
    }
}
