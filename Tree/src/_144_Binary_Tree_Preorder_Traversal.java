import java.util.ArrayList;
import java.util.List;

public class _144_Binary_Tree_Preorder_Traversal {
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

  private List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return res;
    }

    public void preorder(TreeNode root) {
        if (root == null){
            return;
        }

        res.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}
