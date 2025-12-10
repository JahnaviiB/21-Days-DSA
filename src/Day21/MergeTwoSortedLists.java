package Day21;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLists {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }
    public static int[] mergetwolists(int[] list1, int[] list2){
        int l1 = list1.length;
        int l2 = list2.length;
        int[] merged = new int[l1+l2];
        int i=0,j=0,k=0;
        while(i < l1 && j <l2) {
            if (list1[i] <= list2[j]) {
                merged[k++] = list1[i++];
            } else {
                merged[k++] = list2[j++];
            }
        }
            while(i < l1){
                merged[k++] = list1[i++];
            }
            while(j < l2){
                merged[k++] = list2[j++];
            }
        return merged;
    }

    public static void main(String[] args){
        int[] l1 = {1,2,4};
        int[] l2 = {1,3,4};
        int[] output = mergetwolists(l1,l2);
        System.out.println(Arrays.toString(output));
    }
}
