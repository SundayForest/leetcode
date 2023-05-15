package leetcode.hot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 02 --- 24 --- 21:32
 */
public class inorderTraversal94 {
      public class TreeNode {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        process(list,root);
        return list;
    }
    public void process(List<Integer> list,TreeNode treeNode){
          if(treeNode == null){
              return;
          }
          process(list,treeNode.left);
          list.add(treeNode.val);
          process(list,treeNode.right);
    }
}
