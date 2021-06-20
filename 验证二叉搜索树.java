package Tree;

public class 验证二叉搜索树 {
    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        if (node.val <= lower || node.val >= upper) {
            return false;
        }

        boolean is1 = isValidBST(node.left, lower, node.val);
        boolean is2 = isValidBST(node.right, node.val, upper);
        return is1 && is2;
    }
}
