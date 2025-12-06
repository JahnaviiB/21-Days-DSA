package Day4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicates {
    public static boolean checkduplicates(int[] nums){
        Set<Integer> seen = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(seen.contains(nums[i])){
                return true;
            }else {
                seen.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] input = {1,2,3,1};
        boolean output = checkduplicates(input);
        System.out.println(output);
    }
}
