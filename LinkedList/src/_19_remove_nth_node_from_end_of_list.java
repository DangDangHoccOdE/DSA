public class _19_remove_nth_node_from_end_of_list {
      public static class ListNode {
          int val;
          ListNode next;

          ListNode() {
          }

          ListNode(int val) {
              this.val = val;
          }

          ListNode(int val, ListNode next) {
              this.val = val;
              this.next = next;
          }
      }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode theWantedNode = null; // Con trỏ này khi nào biến count lớn hơn n thì sẽ khởi tạo
        ListNode root = head;  // Vì khi con trỏ root trỏ đến cuối thì root sẽ cách theWantedNode đúng bằng n
        int count = 1;
        while(true){
            if(count == n+1){
                theWantedNode = head;
            }

            if(root.next == null){
                if(theWantedNode!=null && theWantedNode.next!=null){
                    theWantedNode.next = theWantedNode.next.next;
                    return head;
                }else{
                    // Ví dụ: có 1 2. n = 2 . Nhưng khi count = 3 thì wanted mới được bắt đầu. Mà count không thể lên 3 => return head.next
                    if(n == count){
                        return head.next;
                    }else{
                        return head; // Ví dụ: có 1 2. n = 3 . Nhưng khi count = 4 thì wanted mới được bắt đầu. Mà count không thể lên 3 => return head.next
                    }
                }
            }

            count++;
            root = root.next;
            theWantedNode = theWantedNode == null ? null : theWantedNode.next;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;

        removeNthFromEnd(n1,2);
        System.out.println("DONE");
    }
}
