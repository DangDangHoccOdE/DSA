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

        List<Integer> currPath = new ArrayList<>();
        dfs(list,currPath,targetSum,root);
        return list;
    }

    public static void dfs(List<List<Integer>> list,List<Integer> currentPath, int target, TreeNode root){
          if(root == null){
              return;
          }
          currentPath.add(root.val);
          if(root.left == null && root.right == null && target == root.val){
              list.add(new ArrayList<>(currentPath));
          }else{
              dfs(list,currentPath,target-root.val,root.left);
              dfs(list,currentPath,target-root.val,root.right);
          }

          // Back tracking

        currentPath.remove(currentPath.size() - 1);
    }
}
