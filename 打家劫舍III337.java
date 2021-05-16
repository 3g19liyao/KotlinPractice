package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 打家劫舍III337 {
    public static void main(String[] args) {

    }

    public int rob(TreeNode root) {
        int[] res = huisu(root);
        return Math.max(res[0],res[1]);
    }
    public int[] huisu(TreeNode node){              //0为不偷当前节点，1为偷当前节点
        if(node == null){
            return new int[2];
        }
        int[] left = huisu(node.left);
        int[] right = huisu(node.right);
        int[] res = new int[2];
        res[0] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        res[1] = left[0] + right[0] + node.val;
        return res;
    }

    /*public int rob(TreeNode root) {                           //审题错误，层次遍历做不了
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int len = queue.size();
            int num = 0;
            for(int i = 0;i < len;i++){
                TreeNode node = queue.remove();
                num += node.val;
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            list.add(num);
        }
        int[] dp = new int[list.size() + 1];
        dp[0] = 0;
        dp[1] = list.get(0);
        for (int i = 1;i < list.size();i++){
            dp[i + 1] = Math.max(dp[i] , dp[i - 1] + list.get(i));
        }
        for (int a:dp){
            System.out.println(a);
        }
        return dp[list.size()];
    }*/

}
