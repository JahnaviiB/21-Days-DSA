package Day4;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> anagramsgrouped(String[] str){
        Map<String,List<String>> map = new HashMap<>();
        for(String word : str){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        String[] inputstrings = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> outputstrings = anagramsgrouped(inputstrings);
        System.out.println(outputstrings);
    }
}
