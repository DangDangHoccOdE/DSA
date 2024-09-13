public class _222_Count_Complete_Tree_Nodes {
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

    public static int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            if(isLeaf(root)){
                return 1;
            }else{
                return countNodes(root.left) + countNodes(root.right)+1;
            }
        }
    }

    public static boolean isLeaf(TreeNode treeNode){
        return treeNode.left == null && treeNode.right == null;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(1);
        TreeNode n4= new TreeNode(1);
        TreeNode n5 = new TreeNode(1);

        n1.left = n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;

        System.out.println(countNodes(n1));
        System.out.println("DONE");
    }
}
