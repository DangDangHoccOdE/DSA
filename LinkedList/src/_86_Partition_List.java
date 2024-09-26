public class _86_Partition_List {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode partition(ListNode head, int x) {
        // Tạo ra 2 ds con chứa nhỏ hơn x và lớn hơn x sau đó ghép chúng vào
        ListNode tempSmaller = new ListNode(0);
        ListNode tempBigger = new ListNode(0);

        ListNode smaller = tempSmaller;
        ListNode bigger = tempBigger;
        while(head != null){
            if(head.val < x){
                smaller.next = head;
                smaller = smaller.next;
            }else{
                bigger.next = head;
                bigger = bigger.next;
            }
            head = head.next;
        }

        bigger.next = null;  // Cái biến bigger nó là duyệt của tempper Bigger. Vì phần tử cuối có thể sẽ < x nên phải gắn bigger.next = null
        smaller.next = tempBigger.next;

        return tempSmaller.next;
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(2);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        n1 = partition(n1,3);
        System.out.println("DONE");
    }
}
