package Tree;

public class 对称二叉树 {

    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        int flag = digui(root.left,root.right);
        if(flag == 1){
            return true;
        }else{
            return false;
        }
    }

    public int digui(TreeNode root1,TreeNode root2){
        int res1 = 0;
        int res2 = 0;
        if (root1 == null && root2 == null) {
            return 1;
        }else if (root1 == null || root2 == null || root1.val != root2.val){
            return -1;                                          //可以将返回值直接改成boolean
        }else{                                                  //可以return digui(root1.left,root2.right) && digui(root1.right,root2.left)
            res1 = digui(root1.left,root2.right);
            res2 = digui(root1.right,root2.left);
        }
        if(res1 == 1 && res2 ==1){
            return 1;
        }else{
            return -1;
        }
    }
}
