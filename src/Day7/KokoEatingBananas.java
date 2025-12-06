package Day7;

import java.util.Arrays;

public class KokoEatingBananas {
    public static int kokosbananas(int[] piles,int h){
        int min_speed = 1;
        int max_speed = Arrays.stream(piles).max().getAsInt();
        while(min_speed < max_speed){
            int mid = min_speed + (max_speed - min_speed) / 2;
            int hours = total_hours(piles,mid);
            if(hours <= h){
                max_speed = mid - 1;
            }
            else{
                min_speed = mid + 1;
            }
        }
        return min_speed;
    }
    public static int total_hours(int[] pile, int speed){
        int hours = 0;
        for(int i : pile){
            hours += (i + speed - 1) / speed;
        }
        return hours;
    }
    public static void main(String[] args){
        int[] input = {3,6,7,11};
        int hours = 8;
        int output = kokosbananas(input,hours);
        System.out.println(output);
    }
}
