package Day6;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean wordpattern(String pattern, String s){
        String[] words= s.split(" ");
        if(pattern.length() != words.length) return false;

        Map<Character,String> pattern1 = new HashMap<>();
        Map<String,Character> words1 = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char patternc = pattern.charAt(i);
            String word = words[i];
            if(pattern1.containsKey(patternc)){
                if(!pattern1.get(patternc).equals(word)) return false;
            }
            else {
                if(words1.containsKey(word)) return false;
                pattern1.put(patternc,word);
                words1.put(word,patternc);

            }
        }
        return true;
    }
    public static void main(String[] args){
        String inputpattern = "abba";
        String inputstring = "dog cat cat dog";
        boolean result = wordpattern(inputpattern,inputstring);
        System.out.println(result);
    }
}
