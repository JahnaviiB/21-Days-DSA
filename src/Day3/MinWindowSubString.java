package Day3;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubString {
    public static String minwindowstring(String s,String t){
        if(s.length() < t.length()) return "";
        int left=0,bestLen=Integer.MAX_VALUE,bestStart = 0;
        Map<Character,Integer> need = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            need.put(c,need.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> have = new HashMap<>();
        int required = need.size();
        int formed = 0;

        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            have.put(c,have.getOrDefault(c,0)+1);

            if(need.containsKey(c) && have.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            while(formed == required && left <= right){
                int winLen = right - left + 1;
                if(winLen < bestLen){
                    bestLen = winLen;
                    bestStart = left;
                }

                char drop = s.charAt(left);
                have.put(drop,have.get(drop) - 1);

                if(need.containsKey(drop) && have.get(drop) < need.get(drop)){
                    formed--;
                }
                left++;
            }
        }
        if(bestLen == Integer.MAX_VALUE) return "";
        return s.substring(bestStart,bestStart+bestLen);
    }
    public static void main(String[] args){
        String inputstring = "ADOBECODEBANC";
        String inputsubstring = "ABC";
        String output = minwindowstring(inputstring,inputsubstring);
        System.out.println(output);
    }
}
