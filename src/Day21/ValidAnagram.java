package Day21;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean checkanagram(String s, String t){
       if(s.length() != t.length()) return false;
       Map<Character,Integer> smap = new HashMap<>();
       for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
           smap.put(c,smap.getOrDefault(c,0)+1);
       }
       for(int i=0;i<s.length();i++){
           char c = t.charAt(i);
           if(!smap.containsKey(c)) return false;
           smap.put(c,smap.get(c) - 1);
           if(smap.get(c) < 0) return false;
       }
       return true;
    }
    public static void main(String[] args){
        String firststring = "anagram";
        String secondstring = "nagaram";
        boolean output = checkanagram(firststring,secondstring);
        System.out.println(output);
    }
}
