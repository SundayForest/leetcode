package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 24 --- 19:00
 */
public class MaxDepth55 {
//    输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
      public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public int maxDepth(TreeNode root) {
        return process(root);
    }
    public int process(TreeNode node){
          if (node == null){
              return 0;
          }
          return Math.max(process(node.left),process(node.right)) + 1;
    }
//    输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树
    public static boolean isBalanced(TreeNode root) {
        return help(root) != -1;
    }
    public static int help(TreeNode node){
          if(node == null){
              return 0;
          }
          int h1 = help(node.right);
          int h2 = help(node.left);
          if(h1 == -1 || h2 == -1 || Math.abs(h1 - h2) > 1){
              return -1;
          }
          return Math.max(h1,h2) + 1;
    }

    public static void main(String[] args) {
        TreeNode n7 = new TreeNode(4);
        TreeNode n6 = new TreeNode(4);
        TreeNode n5 = new TreeNode(3);
        TreeNode n4 = new TreeNode(3);
        TreeNode n3 = new TreeNode(2);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);
        n1.right = n2;
        n1.left = n3;
        n3.right = n4;
        n3.left = n5;
        n5.left = n6;
        n5.right = n7;
        isBalanced(n1);
        System.out.println(isBalanced(n1));

    }
}
