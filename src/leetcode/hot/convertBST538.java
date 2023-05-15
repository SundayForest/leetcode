package leetcode.hot;

import leetcode.common.TreeNode;


/**
 * @author sunday
 * @create 2023 --- 03 --- 07 --- 16:55
 */
public class convertBST538 {
//    给出二叉 搜索 树的根节点，该树的节点值各不相同，请你将其转换为累加树（Greater Sum Tree），
//    使每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。
    public static int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null){
            return null;
        }
        process(root);
        sum = 0;
        return root;
    }
    public void process(TreeNode node){
        if(node == null){
            return;
        }
        process(node.right);
        sum += node.val;
        node.val = sum;
        process(node.left);
    }
}
