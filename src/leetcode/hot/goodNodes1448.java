package leetcode.hot;

import leetcode.common.TreeNode;

/**
 * @author sunday
 * @create 2023 --- 03 --- 07 --- 17:59
 */
public class goodNodes1448 {
    public static int count = 0;
    public int goodNodes(TreeNode root) {
        process(root,Integer.MIN_VALUE);
        int res = count;
        count = 0;
        return res;
    }
    public void process(TreeNode node,int max){
        if(node == null){
            return;
        }
        if(node.val >= max){
            count++;
            max = node.val;
        }
        process(node.right,max);
        process(node.left,max);
    }
}
