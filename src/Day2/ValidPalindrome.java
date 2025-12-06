package Day2;

public class ValidPalindrome {
    public static boolean checkpalindrome(String s){
        String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left = 0, right = cleaned.length()-1;
        while(left < right){
            if(cleaned.charAt(left) != cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String input = "A man, a plan, a canal: Panama";
        boolean result = checkpalindrome(input);
        System.out.println(result);
    }
}
