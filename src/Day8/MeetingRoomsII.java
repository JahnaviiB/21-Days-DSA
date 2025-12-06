package Day8;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public static int meetingrooms(int[][] intervals){
        if(intervals.length == 0) return 0;
        if (intervals.length == 1) return 1;

        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        minheap.offer(intervals[0][1]);

        for(int i=1;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(start >= minheap.peek()){
                minheap.poll();
            }
            minheap.offer(end);
        }
        return minheap.size();
    }
    public static void main(String[] args){
        int[][] input = {{0,30},{5,10},{15,20}};
        int output = meetingrooms(input);
        System.out.println(output);
    }
}
