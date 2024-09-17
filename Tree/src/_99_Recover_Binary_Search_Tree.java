import java.util.*;
public class _99_Recover_Binary_Search_Tree {
      public static class TreeNode {
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

    // Khoi tao 3 tree node
    private static TreeNode prevNode; // Nut truoc do
    private static TreeNode firsNode;
    private static TreeNode secondNode;

    public  static void recoverTree(TreeNode root) {
        if(root == null){
            return;
        }
        inOrder(root);

        if(firsNode != null && secondNode != null){
            int a = firsNode.val;
            firsNode.val = secondNode.val;
            secondNode.val = a;
        }
    }

    public static void inOrder(TreeNode root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        if(prevNode!=null && root.val < prevNode.val && firsNode == null){
            firsNode = prevNode;
        }

        if(prevNode != null && root.val < prevNode.val && firsNode != null){
            secondNode= root;
        }

        // Neu prev node ch ton tai
        prevNode = root;
        inOrder(root.right);
    }
    // ví dụ cây 2 3 6
    // Đầu tiên prev = 3;
    // Xong nó sẽ lên trên => root = 2, prev = 3 => sai first = 3 second =2;

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(6);

        n1.left = n2;
        n1.right = n3;

        recoverTree(n1);
    }
}

