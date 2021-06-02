package Tree;

public class 翻转二叉树 {

    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        TreeNode res = digui(root);
        return res;
    }

    private TreeNode digui(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode left = digui(root.right);
        TreeNode right = digui(root.left);
        root.right = right;
        root.left = left;
        return root;
    }
}
