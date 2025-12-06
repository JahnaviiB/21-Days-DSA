package Day3;

import java.util.HashMap;
import java.util.Map;

public class PerumtationOfString {
    public static boolean stringpermutation(String s1,String s2){
        if(s1.length() > s2.length()) return false;
        Map<Character,Integer> need = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            need.put(c,need.getOrDefault(c,0)+1);
        }

        Map<Character,Integer> have = new HashMap<>();
        int left = 0;
        for(int right=0;right<s2.length();right++){
            char c = s2.charAt(right);
            have.put(c,have.getOrDefault(c,0)+1);
            int winLen = right - left + 1;
            if(winLen > s1.length()){
                char drop = s2.charAt(left);
                have.put(drop, have.get(drop) - 1);
                if(have.get(drop) == 0){
                    have.remove(drop);
                }
                left++;
                winLen = right - left + 1;
            }
            if(winLen == s1.length()){
                if(have.equals(need)) return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String string1 = "ab";
        String string2 = "eidbaooo";
        boolean output = stringpermutation(string1,string2);
        System.out.println(output);
    }
}
