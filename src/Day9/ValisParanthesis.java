package Day9;

import java.util.Stack;

public class ValisParanthesis {
    public static boolean validparanthesis(String s){
        Stack<Character> seen = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                seen.push(c);
            }
            else if(c == ')' || c == ']' || c == '}'){
                if(seen.isEmpty()) return false;
                char top = seen.pop();
                if(c == ')' && top != '(' || c == ']' && top != '[' || c == '{' && top != '}'){
                    return false;
                }

            }
        }
        return seen.isEmpty();
    }
    public static void main(String[] args){
        String intput = "()[]{}";
        boolean output = validparanthesis(intput);
        System.out.println(output);
    }

}
