package leetcode.hot;


import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 03 --- 03 --- 13:57
 */
public class flatten114 {
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
//  给你二叉树的根结点 root ，请你将它展开为一个单链表：
//
//展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
//展开后的单链表应该与二叉树 先序遍历 顺序相同。

    public void flatten(TreeNode root) {
        TreeNode cur = root;
        while (cur!=null){
            if(cur.left!=null){
                TreeNode node = cur.left;
                while (node.right != null){
                    node = node.right;
                }
                node.right = cur.right;
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
    }

}
