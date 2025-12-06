package Day4;

import java.util.*;

public class TopKFrequentElements {
    public static int[] frequentelements(int[] nums,int k){
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = list.get(i).getKey();
        }
        return result;
    }
    public static void main(String[] args){
        int[] inputnumbers = {1,1,1,2,2,3};
        int kmost = 2;
        int[] output = frequentelements(inputnumbers,kmost);
        System.out.println(Arrays.toString(output));
    }
}
