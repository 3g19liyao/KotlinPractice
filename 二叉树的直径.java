package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 二叉树的直径 {
    public static void main(String[] args) {

    }

    public int diameterOfBinaryTree1(TreeNode root) {
        int left = digui(root.left,0);
        int right = digui(root.right,0);
        System.out.println(left + "    " +right);
        return right + left;
    }

    private int digui(TreeNode root,int num){
        if(root == null){
            return num - 1;
        }
        int left = digui(root.left,num + 1);
        int right = digui(root.right,num + 1);
        System.out.println(left + "    " +right);
        return Math.max(left,right);
    }

    int res;
    public int diameterOfBinaryTree(TreeNode root) {
        res = 1;
        depth(root);
        return res - 1;
    }
    public int depth(TreeNode node) {
        if (node == null) {
            return 0; // 访问到空节点了，返回0
        }
        int L = depth(node.left); // 左儿子为根的子树的深度
        int R = depth(node.right); // 右儿子为根的子树的深度
        res = Math.max(res, L+R+1); // 计算d_node即L+R+1 并更新ans
        return Math.max(L, R) + 1; // 返回该节点为根的子树的深度
    }
}
