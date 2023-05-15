package leetcode.hot;

import leetcode.common.TreeNode;

/**
 * @author sunday
 * @create 2023 --- 03 --- 16 --- 22:06
 */
public class 合并二叉树 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return process(root1,root2);
    }
    public TreeNode process(TreeNode node1, TreeNode node2){
        if(node1 == null){
            node1 = node2;
            return node1;
        }else if(node2 == null){
            return node1;
        }
        node1.val += node2.val;
        node1.right = process(node1.right,node2.right);
        node1.left = process(node1.left,node2.left);
        return node1;
    }
}
