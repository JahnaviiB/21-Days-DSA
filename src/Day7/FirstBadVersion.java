package Day7;

public class FirstBadVersion {
    public static boolean isBadVersion(int version) {
        return version >= 4;
    }
    public static int firstBadVersion(int n){
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args){
        int input = 5;
        int output = firstBadVersion(input);
        System.out.println(output);
    }
}