package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 21 --- 15:34
 */
public class kthLargest54 {
//    给定一棵二叉搜索树，请找出其中第 k 大的节点的值。
    int count = 0;
    int res = 0;
    public int kthLargest(TreeNode root, int k) {
        process(root,k);
        return res;
    }
    public void process(TreeNode node,int k){
        if(node == null){
            return;
        }
        process(node.right,k);
        if(k == ++ count){
            res = node.val;
        }
        process(node.left,k);
    }
}
