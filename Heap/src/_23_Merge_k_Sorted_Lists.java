import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.*;

public class _23_Merge_k_Sorted_Lists {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> queue = new PriorityQueue<>(Comparator.comparing(node->node.val));
        for(ListNode listNode : lists){
            if(listNode!=null){
                queue.add(listNode);
            }
        }

        ListNode head = null;  // head là nút đầu danh sách
        ListNode lastNode = null; // lastnode là nút cuối danh sách
        while(!queue.isEmpty()){
            ListNode curr = queue.poll(); // Lay ra th nho nhat
            if(head == null) {
                head = curr;
            }else{
                lastNode.next = curr;
            }
            ListNode node = curr.next; // Add thằng tiếp theo sau số nhỏ nhất lại vào queue
            if(node!=null){
                queue.add(node);
            }

            lastNode = curr; // Gắn lastNode= curr để nó có thể kết nối với các th sau
        }

        return head;
    }
    // Biến head kởi tạo, Biến lastNode sẽ giống head nhưng lastNode có nhiệm vụ kết nói các nút có giá nhỏ nhất được poll ra
    // Khi lastnode.next thì tức là giá trị trong head cũng bị thay đổi vì head bản chất giống lastnode

    // Method to convert an array to a linked list
    public static ListNode arrayToListNode(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Method to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Define arrays to be converted into linked lists
        int[][] arrays = {{1, 4, 5}, {1, 3, 4}, {2, 6}};
        ListNode[] lists = new ListNode[arrays.length];

        // Convert each array to a linked list
        for (int i = 0; i < arrays.length; i++) {
            lists[i] = arrayToListNode(arrays[i]);
        }

        // Merge all linked lists into one
        ListNode mergedList = mergeKLists(lists);

        // Print the merged linked list
        System.out.print("Merged Linked List: ");
        printList(mergedList);
    }
}
