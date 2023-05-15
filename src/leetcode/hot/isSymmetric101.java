package leetcode.hot;

import leetcode.common.TreeNode;

/**
 * @author sunday
 * @create 2023 --- 03 --- 04 --- 15:25
 */
public class isSymmetric101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return process(root.left,root.right);
    }
    public boolean process(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val == right.val){
            boolean flag = process(left.left,right.right);
            return flag ? process(left.right,right.left) : flag;
        }
        return false;
    }
}
