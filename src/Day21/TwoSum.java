package Day21;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] sumoftwo(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] input = {2,7,11,15};
        int t = 9;
        int[] output = sumoftwo(input,t);
        System.out.println(Arrays.toString(output));
    }
}
