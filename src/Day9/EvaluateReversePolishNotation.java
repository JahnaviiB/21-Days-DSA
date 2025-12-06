package Day9;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static int reversenotation(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                switch (token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args){
        String[] input = {"2","1","+","3","*"};
        int output = reversenotation(input);
        System.out.println(output);
    }
}
