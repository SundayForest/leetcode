package leetcode.off;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 01 --- 21 --- 13:40
 */
public class pathSum34 {
//    给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
      public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> res = new ArrayList<>();
        process(root,target,res,new ArrayList<>());
        return res;
    }
    public static void process(TreeNode node ,int target,List<List<Integer>> res,List<Integer> list){
        if(node == null){
            return;
        }
        if(node.right == null && node.left == null){
            if(target == node.val){
                list.add(node.val);
                List<Integer> list1 = new ArrayList<>(list);
                res.add(list1);
                list.remove(list.size() - 1);
            }
            // list.remove(list.size() - 1);
            return;
        }
        target -= node.val;
        list.add(node.val);
        process(node.left,target,res,list);
        process(node.right,target,res,list);
        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode n7 = new TreeNode(7,null,null);
        TreeNode n8 = new TreeNode(2,null,null);
        TreeNode n9 = new TreeNode(5,null,null);
        TreeNode n10 = new TreeNode(1,null,null);
        TreeNode n5 = new TreeNode(13,null,null);
        TreeNode n4 = new TreeNode(11,n7,n8);
        TreeNode n6 = new TreeNode(4,n9,n10);
        TreeNode n2 = new TreeNode(4,n4,null);
        TreeNode n3 = new TreeNode(8,n5,n6);
        TreeNode n1 = new TreeNode(5,n2,n3);
        pathSum(n1,22);
    }
}
