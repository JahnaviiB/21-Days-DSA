package Day3;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithout {
    public static int withoutrepeating(String s){
        if(s == null) return 0;
        int n = s.length();
        Map<Character,Integer> seen = new HashMap<>();
        int left = 0, best = 0;

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(seen.containsKey(c) && seen.get(c) >= left){
                left = seen.get(c) + 1;
            }
            seen.put(c,i);
            best = Math.max(best,i - left + 1);
        }
        return best;
    }
    public static void main(String[] args){
        String input = "abcabcbb";
        int output = withoutrepeating(input);
        System.out.println(output);
    }
}
