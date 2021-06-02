package Tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class 后序遍历 {

    public static void main(String[] args) {

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        digui(root,list);
        return list;
    }

    public void digui(TreeNode root,List<Integer> list){
        if(root != null){
            digui(root.left,list);
            digui(root.right,list);
            list.add(root.val);
        }else{
            return ;
        }
    }
}
