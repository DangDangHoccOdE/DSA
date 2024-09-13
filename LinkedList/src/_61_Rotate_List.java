import common.ListNode;

public class _61_Rotate_List {

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null){
            return head ;
        }
        int counter = 0;
        ListNode tempCounter = head;
        while(tempCounter!=null){
            counter++;
            tempCounter = tempCounter.next;
        }

        int x = 0;
        if(k>counter){
            k=k%counter;
            System.out.println(x);
        }

        ListNode curr = head;
        while (x<k){
            x++;
            curr = reverse(curr);
        }
        return curr;
    }

    private static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while ((curr.next!=null)){
            prev = curr;
            curr =curr.next;
        }

        prev.next = null;
        curr.next = head;
        head = curr;

        return head;
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next=n3;
        n3.next=n4;

        ListNode result = rotateRight(n1,6);
        ListNode.printNode(result);
    }
}
