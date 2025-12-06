package Day6;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean happynumber(int n){
        Set<Integer> seen = new HashSet<>();
        while(n != 1){
            if(seen.contains(n)){
                return false;
            }
            seen.add(n);

            int sum = 0;
            int temp = n;
            while(temp > 0){
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
            n = sum;
        }
        return true;
    }
    public static void main(String[] args){
        int input = 19;
        boolean output = happynumber(input);
        System.out.println(output);
    }
}
