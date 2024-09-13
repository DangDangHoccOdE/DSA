public class _701_Insert_into_a_Binary_Search_Tree {
   public class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
   }
       public TreeNode insertIntoBST(TreeNode head, int val) {
            // check xem root nay da null chua
           if(head == null){
               return new TreeNode(val);
           }

//           TreeNode root = head;
//           // cach vonglap
//           while(true){
//               if(val < root.val){
//                   if(root.left == null){
//                       // gia tri can chen
//                       root.left = new TreeNode(val);
//                       break;
//                   }else{
//                       root = root.left;
//                   }
//               }else{
//                   if(root.right == null){
//                       root.right = new TreeNode(val);
//                       break;
//                   }else{
//                       root = root.right;
//                   }
//               }
//           }
//           return head;

           // cach de quy
           if(val < head.val){
               if(head.left == null){
                   head.left = new TreeNode(val);
               }else{
                   insertIntoBST(head.left,val);
               }
           }else{
               if(head.right == null){
                   head.right = new TreeNode(val);
               }else{
                   insertIntoBST(head.right,val);
               }
           }

           return head;
       }
}
