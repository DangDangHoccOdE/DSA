import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _23_Merge_k_Sorted_Lists {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> heap = new PriorityQueue<>(Comparator.comparing(node->node.val));
        for (ListNode listNode : lists){
            if(listNode!=null){
                heap.add(listNode);
            }
        }

        ListNode root = null;
        ListNode lastNode = null;
        while(!heap.isEmpty()){
            ListNode curr = heap.poll();
            if(root == null){
                root = curr;
            }else{
                lastNode.next = curr;
            }
            if(curr!=null){
                heap.add(curr.next);
            }
            lastNode = curr;
        }
          return root;
    }

    public static void main(String[] args) {

    }
}
