package Day6;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isomorphic(String s,String t){
        if(s.length() != t.length()) return false;

        Map<Character,Character> s1 = new HashMap<>();
        Map<Character,Character> t1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(s1.containsKey(sc)){
                if(s1.get(sc) != tc){
                    return false;
                }
            }
            else {
                if (t1.containsKey(tc)) return false;
                s1.put(sc, tc);
                t1.put(tc, sc);
            }
        }
        return true;
    }
    public static void main(String[] args){
        String string1 = "egg";
        String string2 = "add";
        boolean output = isomorphic(string1,string2);
        System.out.println(output);
    }
}
