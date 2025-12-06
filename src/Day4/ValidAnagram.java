package Day4;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean checkanagram(String s, String t){
        if(s.length() != t.length()) return false;
        Map<Character,Integer> freq = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);

            if(!freq.containsKey(c)){
                return false;
            }
            freq.put(c,freq.get(c) - 1);

        }
        for(int count:freq.values()){
            if(count != 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String string1 = "anagram";
        String string2 = "nagaram";
        boolean output = checkanagram(string1,string2);
        System.out.println(output);
    }
}
