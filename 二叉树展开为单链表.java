package Tree;

import sun.plugin.javascript.navig.LinkArray;

import java.util.ArrayList;
import java.util.List;

public class 二叉树展开为单链表 {
    public static void main(String[] args) {

    }

    public void flatten(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        digui(root,list);
        TreeNode node = root;
        TreeNode pre = node;
        for(int i = 1;i < list.size();i++){
            pre.left = null;
            pre.right = new TreeNode(list.get(i));
            pre = pre.right;
        }
    }

    private void digui(TreeNode root, List<Integer> list){
        if(root == null){
            return ;
        }
        list.add(root.val);
        digui(root.left,list);
        digui(root.right,list);
    }
}
