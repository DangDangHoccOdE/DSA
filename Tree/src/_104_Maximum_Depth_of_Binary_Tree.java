public class _104_Maximum_Depth_of_Binary_Tree {
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

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int max1 = maxDepth(root.left);
        int max2 = maxDepth(root.right);

        int result = Math.max(max1,max2)+1;

        return result;
    }

}
