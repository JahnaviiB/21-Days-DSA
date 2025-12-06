package Day10;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static int[] maxofwindow(int[] nums, int k){
        int n = nums.length;
        int index = 0;
        if(n == 0 || k == 0) return new int[0];
        int left = 0, right = 0;
        int[] result = new int[n - k +1];
        Deque<Integer> dq = new ArrayDeque<>();

        while(right < n) {
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[right]) {
                dq.pollLast();
            }
            dq.offerLast(right);

            if (!dq.isEmpty() && left > dq.peekFirst()) {
                dq.pollFirst();
            }
            if ((right + 1) >= k) {
                result[index++] = nums[dq.pollFirst()];
                left++;
            }
            right++;
        }
        return result;
    }
    public static void main(String[] args){
        int[] input = {1,3,-1,-3,5,3,6,7};
        int windowSize = 3;
        int[] output = maxofwindow(input,windowSize);
        System.out.println(Arrays.toString(output));
    }
}
