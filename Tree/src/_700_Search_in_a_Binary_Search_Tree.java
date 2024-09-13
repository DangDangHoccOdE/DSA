public class _700_Search_in_a_Binary_Search_Tree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
        public static TreeNode searchBST(TreeNode root, int val) {
            if (root == null) {
                return null;
            }

            if (val < root.val) {
               return searchBST(root.left, val);
            } else if (val > root.val) {
                return searchBST(root.right, val);
            }


            return root;
        }

        public static void main(String[] args) {
            TreeNode n1 = new TreeNode(4);
            TreeNode n2 = new TreeNode(2);
            TreeNode n3 = new TreeNode(7);
            TreeNode n4 = new TreeNode(1);
            TreeNode n5 = new TreeNode(3);

            n1.left = n2;
            n1.right = n3;
            n2.left = n4;
            n2.right = n5;

            TreeNode s = searchBST(n1, 2);
            System.out.println("DONE");
    }
}
