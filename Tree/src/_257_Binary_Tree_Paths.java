import java.util.*;
public class _257_Binary_Tree_Paths {
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root!=null){
            duyetCay(root,"",list);
        }
        return list;
    }

    public void duyetCay(TreeNode root,String path,List<String> list){
       if(root.left==null && root.right ==null){
           list.add(path + root.val);
       } if(root.left != null){
           duyetCay(root.left,path + root.val + "->",list);
       } if(root.right!=null){
           duyetCay(root.right,path + root.val + "->" , list);
       }
    }
}
