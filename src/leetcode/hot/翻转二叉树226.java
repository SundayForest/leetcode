package leetcode.hot;

import leetcode.common.TreeNode;

/**
 * @author sunday
 * @create 2023 --- 03 --- 12 --- 15:16
 */
public class 翻转二叉树226 {
    public TreeNode invertTree(TreeNode root) {
        process(root);
        return root;
    }
    public void process(TreeNode node){
        if (node == null){
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        process(node.right);
        process(node.left);
    }
}
