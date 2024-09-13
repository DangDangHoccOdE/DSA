import common.ListNode;

public class _148_Sort_List {

    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode getMiddleNode = getMiddle(head);
        ListNode getMiddleNodeNext = getMiddleNode.next;
        getMiddleNode.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(getMiddleNodeNext);

        return mergeSort(left,right);
    }

    public static ListNode getMiddle(ListNode head){
        if (head == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode mergeSort(ListNode n1,ListNode n2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(n1!=null && n2!=null){
            if(n1.val < n2.val){
                current.next = n1;
                n1=n1.next;
            }else{
                current.next = n2;
                n2=n2.next;
            }
            current = current.next;
        }

        if(n1!=null){
            current.next = n1;
        }else{
            current.next=n2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(7);
        ListNode n5 = new ListNode(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode m1 = new ListNode(2);
        ListNode m2 = new ListNode(4);
        ListNode m3 = new ListNode(6);

        m1.next = m2;
        m2.next = m3;

//        n1 = sortList(n1);
        ListNode n1a = mergeSort(n1,m1);
        ListNode.printNode(n1a);
    }
}
