package Day9;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static int[] dailytemperatures(int[] temperatures){
        Stack<Integer> stack = new Stack<>();
        int[] answers = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prevIndex = stack.pop();
                answers[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return answers;
    }
    public static void main(String[] args){
        int[] input = {73,74,75,71,69,72,76,73};
        int[] output = dailytemperatures(input);
        System.out.println(Arrays.toString(output));
    }
}
