package Tree;


import java.util.ArrayList;
import java.util.List;



public class εεΊιε {
    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTree(root,list);
        return list;
    }
    public void preorderTree(TreeNode node , List<Integer> list){
        if(node != null){
            list.add(node.val);
            preorderTree(node.left,list);
            preorderTree(node.right,list);
        }else{
            return ;
        }
    }
}