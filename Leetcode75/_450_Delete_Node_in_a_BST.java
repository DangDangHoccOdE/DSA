package Leetcode75;

public class _450_Delete_Node_in_a_BST {
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

    // Tìm giá trị nhỏ nhất trong cây con phải
    public static TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        // ktra xem cay co rong khong
        if(root == null) return null;

        if(root.val < key){
            root.right = deleteNode(root.right, key);
        }else if(root.val > key){
            root.left = deleteNode(root.left,key);
        }else{
            // th bang
            // Neu nut can xoa la nut la
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
                TreeNode temp = findMin(root.right);
                root.val = temp.left.val;

                root.right = deleteNode(root.right,temp.val);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(50);
        treeNode.left = new TreeNode(30);
        treeNode.right = new TreeNode(70);
        treeNode.left.right = new TreeNode(40);
        treeNode.right.left = new TreeNode(60);
        treeNode.right.right = new TreeNode(80);

        deleteNode(treeNode, 50);
    }
}
