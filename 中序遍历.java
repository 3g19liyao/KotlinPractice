package Tree;

import java.util.ArrayList;
import java.util.List;

public class 中序遍历 {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        digui(root,list);
        return list;
    }

    public void digui(TreeNode root,List<Integer> list){
        if(root != null){
            digui(root.left,list);
            list.add(root.val);
            digui(root.right,list);
        }else{
            return ;
        }
    }
}

