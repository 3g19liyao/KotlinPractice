package Tree;

public class 二叉树最大深度 {

    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        int res = maxDepth(root,0);
        return res;
    }
    public int maxDepth(TreeNode node , int max){
        if(node == null){
            return max;
        }
        int left = maxDepth(node.left,max + 1);
        int right = maxDepth(node.right,max + 1);
        return Math.max(left,right);
    }
}
