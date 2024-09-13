import common.ListNode;

public class _2_Add_Two_Numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int soNho = 0;

        ListNode temnp = add(l1,l2,soNho);
        System.out.println(temnp.val);
        return temnp;
    }

    public static ListNode add(ListNode a, ListNode b, int soNho){
          if(a==null && b==null && soNho==0){
              return null;
          }
          int x = (a!=null)?a.val:0;
          int y = (b!=null)?b.val:0;
        System.out.println(x+y);
          int sum = x+y+soNho;

          ListNode result = new ListNode(sum%10);
          if(a!=null){
              a=a.next;
          }
          if(b!=null){
              b=b.next;
          }
         result.next = add(a,b,sum/10);

          printNode(result);
        System.out.println();
          return result;
    }

    private static void printNode(ListNode headNode){
          if(headNode == null){
              System.out.println("ListNode is empty");
          }else{
              ListNode temp = headNode;
              while(temp!=null){
                  System.out.print(temp.val);
                  temp=temp.next;
                  if(temp!=null){
                      System.out.print("->");
                  }
              }
          }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(9);
        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(9);
        ListNode n7 = new ListNode(9);
        ListNode n8 = new ListNode(9);
        ListNode n9 = new ListNode(9);
        ListNode n10 = new ListNode(9);

        n1.next = n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;

        n7.next=n8;
        n8.next=n9;
        n9.next=n10;

        ListNode.printNode(n1);
        System.out.println();
        ListNode.printNode(n7);
        System.out.println();
        ListNode result = addTwoNumbers(n1,n7);
    ListNode.printNode(result);
    }
}
