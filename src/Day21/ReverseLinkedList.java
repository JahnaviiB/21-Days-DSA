package Day21;

import java.util.Arrays;

public class ReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){ this.val = val; }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode nextnode = current.next;
            current.next = prev;
            prev = current;
            current = nextnode;
        }
        return prev;
    }

    // helper to convert array → linked list
    public static ListNode buildList(int[] arr){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int num : arr){
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    // helper to convert linked list → array
    public static int[] listToArray(ListNode head){
        int count = 0;
        ListNode temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        int[] arr = new int[count];
        temp = head;
        int i = 0;

        while(temp != null){
            arr[i++] = temp.val;
            temp = temp.next;
        }

        return arr;
    }

    public static void main(String[] args){
        int[] input = {1,2,3,4,5};

        // step 1: convert array to linked list
        ListNode head = buildList(input);

        // step 2: reverse the linked list
        ListNode reversed = reverseList(head);

        // step 3: convert reversed list to array
        int[] output = listToArray(reversed);

        // step 4: print result
        System.out.println(Arrays.toString(output));
    }
}
