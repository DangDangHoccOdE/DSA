public class MyBST {
    private TreeNode mRoot;

    public MyBST() {
    }

    public TreeNode insert(TreeNode root, int value){
        // root = null
        if(root == null){
            return new TreeNode(value);
        }

        TreeNode temp = root;
        while(true){
            if(temp.val < value){
                if(temp.right == null){
                    temp.right = new TreeNode(value);
                    break;
                }else{
                    temp = temp.right;
                }
            }else{
                if(temp.left==null){
                    temp.left = new TreeNode(value);
                    break;
                }else{
                    temp = temp.left;
                }
            }
        }
        return root ;
    }

    public TreeNode insertIntoBST(TreeNode root,int value){
        if(root == null){
            return new TreeNode(value);
        }

        if(value < root.val){
            if(root.left == null){
                root.left = new TreeNode(value);
            }else{
                insertIntoBST(root.left,value);
            }
        }else{
            if(root.right == null){
                root.right = new TreeNode(value);
            }else{
                insertIntoBST(root.right,value);
            }
        }

        return root;
    }
}
