public class _21_Merge_Two_Sorted_Lists {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while(list1!=null && list2!= null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 == null){
            temp.next = list2;
        }else{
            temp.next = list1;
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;


        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(2);
        ListNode n6 = new ListNode(4);

        n4.next = n5;
        n5.next = n6;

        mergeTwoLists(n1,n4);

    }
}
