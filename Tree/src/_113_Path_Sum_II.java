import java.util.*;
public class _113_Path_Sum_II {
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

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();

        return list;
    }

    public void duyet(List<List<Integer>> list,int target,TreeNode root,int count){
          if(root == null){
              return;
          }
          count+=root.val;
          duyet(list,target,root.left,count);
          if(count == target){

          }

    }
}
