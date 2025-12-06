package Day3;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeating {
    public static int repeatingcharacter(String s,int k){
        if(s == null || s.isEmpty()) return 0;
        int left=0,best=0,maxFreq=0;
        Map<Character,Integer> count = new HashMap<>();

        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            count.put(c,count.getOrDefault(c,0)+1);
            maxFreq = Math.max(maxFreq,count.get(c));

            int winLen = right - left + 1;
            if(winLen - maxFreq > k){
                char drop = s.charAt(left);
                count.put(drop,count.get(drop) - 1);
                left++;
            }
            best = Math.max(best,right - left + 1);
        }
        return best;
    }
    public static void main(String[] args){
        String input = "AABABBA";
        int replacecount = 1;
        int output = repeatingcharacter(input,replacecount);
        System.out.println(output);
    }
}
