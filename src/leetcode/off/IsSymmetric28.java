package leetcode.off;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 01 --- 07 --- 11:49
 */
public class IsSymmetric28 {
//    请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
    public static boolean isSymmetric(TreeNode root) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        pre(list1,root);
        mirrorTree(root);
        pre(list2,root);
        for(int i = 0; i < list1.size(); i++){
            if(!list1.get(i).equals(list2.get(i))){
                return false;
            }
        }
        return true;
    }
    public static void pre(List<Integer> list,TreeNode node){
        if(node == null){
            list.add(-1000);
            return;
        }
        list.add(node.val);
        pre(list,node.left);
        pre(list,node.right);
    }
    public static TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }
        help(root);
        return root;
    }
    public static void help(TreeNode node){
        if(node == null){
            return;
        }
        TreeNode treeNode = node.right;
        node.right = node.left;
        node.left = treeNode;
        help(node.right);
        help(node.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        isSymmetric(root);
    }
}
