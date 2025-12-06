package Day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
    public static int[] indexesofsum(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = k - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i+1};
            }
            map.put(nums[i],i+1);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] inputnumbers = {2,7,11,15};
        int target = 9;
        int[] output = indexesofsum(inputnumbers,target);
        System.out.println(Arrays.toString(output));
    }
}
