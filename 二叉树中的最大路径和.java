package Tree;

public class 二叉树中的最大路径和 {
    public static void main(String[] args) {

    }

    static int num;

    public static int maxPathSum(TreeNode root) {
        num = Integer.MIN_VALUE;
        if(root.left == null && root.right == null){
            return root.val;
        }
        int sum = digui(root);
        return Math.max(num,sum);
    }

    private static int digui(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = digui(root.left);
        int right = digui(root.right);
        num = Math.max(Math.max(root.val + right,num),Math.max(root.val + left + right,Math.max(root.val,root.val + left)));
        return Math.max(root.val,Math.max(root.val + left,root.val + right));
    }

}
