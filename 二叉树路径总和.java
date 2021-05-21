package Tree;

import java.util.ArrayList;
import java.util.List;

public class 二叉树路径总和 {

    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return false;
        }
        digui(root,list,0);
        if(list.contains(targetSum)){
            return true;
        }else{
            return false;
        }
    }

    public void digui(TreeNode root,List<Integer> list,int num){
        if(root != null){
            num += root.val;
        }else{
            return ;
        }
        if(root.left == null && root.right == null){
            list.add(num);
        }else{
            digui(root.left,list,num);
            digui(root.right,list,num);
        }
    }

}
