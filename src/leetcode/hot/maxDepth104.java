package leetcode.hot;

import leetcode.common.TreeNode;

/**
 * @author sunday
 * @create 2023 --- 03 --- 05 --- 9:58
 */
public class maxDepth104 {
//    给定一个二叉树，找出其最大深度。
//
//二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
    public int maxDepth(TreeNode root) {
        return process(root);
    }
    public int process(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = process(node.left);
        int right = process(node.right);
        return Math.max(left,right) + 1;
    }
}
