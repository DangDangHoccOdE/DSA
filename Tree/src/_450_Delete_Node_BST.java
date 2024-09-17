public class _450_Delete_Node_BST {
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

    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }

        if(root.val < key){
            root.right = deleteNode(root.right,key);
        }else if(root.val > key){
            root.left = deleteNode(root.left,key);
        }else { // th bang
            if(root.left == null && root.right == null){
                root = null;
            }else if(root.right == null && root.left != null){
                return root.left;
            }else if(root.left == null && root.right != null){
                return root.right;
            }else{
                // Co 2 con
                // Tim nut trai cung ben phai
                TreeNode find = timCayTraiCungBenPhai(root.right);
                root.val = find.val;
                // Delete find;
                root.right = deleteNode(root.right,find.val);
            }
        }
        return root;
    }

    public static TreeNode timCayTraiCungBenPhai(TreeNode treeNode){
        TreeNode index = treeNode;
        if(index == null){
            return null;
        }

        while(index.left!=null){
            index = index.left;
        }

        return index;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;

        System.out.println(deleteNode(n1,5));
    }
}
