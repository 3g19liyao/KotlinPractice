package Tree;

public class 二叉树的最近公共祖先 {

    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==p||root==q) {
            return root;
        }
        if (root!=null){
            TreeNode lNode=lowestCommonAncestor(root.left,p,q);
            TreeNode rNode=lowestCommonAncestor(root.right,p,q);
            if (lNode!=null&&rNode!=null)
                return root;
            else if(lNode==null) {//两个都在右子树
                return rNode;
            }
            else { //两个都在左子树里面
                return lNode;
            }
        }
        return null;
    }

}
