package leetcode.hot;

import leetcode.common.TreeNode;

/**
 * @author sunday
 * @create 2023 --- 03 --- 04 --- 14:52
 */
public class Search2List {
//    搜索二叉 变  单链表
    public TreeNode increasingBST(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode head = root;
        boolean f = true;
        TreeNode pre = null;
        while (head != null){
            TreeNode left = head.left;
            if (left == null){
                pre = head;
                head = head.right;
                f = false;
                continue;
            }
            if(f){
                root = left;
            }
            TreeNode right = left;
            while (right.right != null){
                right = right.right;
            }
            if(!f){
                pre.right = left;
            }
            right.right = head;
            head.left = null;
            head = left;
        }
        return root;
    }
}
