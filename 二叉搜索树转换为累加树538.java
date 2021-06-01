package Tree;

public class 二叉搜索树转换为累加树538 {
    public static void main(String[] args) {

    }
    static int num = 0;
    public static TreeNode convertBST(TreeNode root) {
        digui(root);
        System.out.println(num);
        return root;
    }

    private static void digui(TreeNode root){
        if(root != null){
            digui(root.right);
            num += root.val;
            root.val = num;
            digui(root.left);
        }else{
            return ;
        }
    }
}
