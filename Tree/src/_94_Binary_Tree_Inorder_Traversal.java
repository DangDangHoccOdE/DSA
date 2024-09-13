import java.util.*;
public class _94_Binary_Tree_Inorder_Traversal {
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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Inorder(root,list);
        return list;
    }

    public void Inorder(TreeNode currentNode,List<Integer> ds){
        if(currentNode == null){
            return;
        }

        Inorder(currentNode.left,ds);
        ds.add(currentNode.val);
        Inorder(currentNode.right,ds);
    }
}
