import common.ListNode;

import java.awt.*;

public class ReverseLinkedList {
    // vong lap
    public static ListNode reverseLoop(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public static ListNode reverseRecur(ListNode head){
            if(head == null || head.next== null){
                return head;
            }

            ListNode rest = reverseRecur(head.next);
            head.next.next = head;
            head.next = null;

            return rest;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;


        n1 = reverseRecur(n1);
        ListNode.printNode(n1);
    }
}
