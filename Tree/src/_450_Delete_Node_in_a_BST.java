public class _450_Delete_Node_in_a_BST {
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

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }

        if(root.val < key){
            root.right = deleteNode(root.right,key);
        }else if(root.val > key){
            root.left = deleteNode(root.left,key);
        }else{
            // root.val = key
            // th1 : root là node lá
            if(root.left == null && root.right == null){
                return null;
            }

            // th2 : root có nút con trái
            if(root.left !=null && root.right ==null){
                return root.left;
            }

            // th3: có cây con bên phải
            if(root.left == null && root.right!=null){
                return root.right;
            }

            // có 2 con
            // tìm node trái cùng của cây con bên phải
            TreeNode leftModeNode = timCayConTraiCungBenPhai(root.right);
            root.val= leftModeNode.val;

            root.right = deleteNode(root.right , leftModeNode.val);
        }
        return root;
    }

    public TreeNode timCayConTraiCungBenPhai(TreeNode root){
        if(root == null){
            return null;
        }
        while(root.left != null){
            root = root.left;
        }

        return root;
    }
}
