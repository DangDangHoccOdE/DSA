public class _112_Path_Sum {
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

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            return root.val==targetSum;
        }

        boolean isLeft = hasPathSum(root.left,targetSum-root.val);
        boolean isRight = hasPathSum(root.right,targetSum-root.val);
        return isLeft||isRight;
    }
}
