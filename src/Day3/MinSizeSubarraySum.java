package Day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinSizeSubarraySum {
    public static int subarraysum(int[] nums,int k){
        int left = 0,sum = 0,best = Integer.MAX_VALUE;
        Map<Integer,Integer> count = new HashMap<>();

        for(int right=0;right<nums.length;right++){
            sum += nums[right];

            while(sum >= k){
                int winLen = right - left + 1;
                best = Math.min(best, winLen);
                sum -= nums[left];
                left++;
            }
            best = Math.max(best,right - left + 1);
        }
        return best;
    }
    public static void main(String[] args){
        int[] input = {2,3,1,2,4,3};
        int target = 7;
        int output = subarraysum(input,target);
        System.out.println(output);
    }
}
