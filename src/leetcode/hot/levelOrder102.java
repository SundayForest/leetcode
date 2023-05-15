package leetcode.hot;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 03 --- 03 --- 13:44
 */
public class levelOrder102 {
//    给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        if(root == null){
            return list;
        }
        linkedList.add(root);
        process(linkedList,list);
        return list;
    }
    public void process(LinkedList<TreeNode> linkedList,List<List<Integer>> list){
        int size = linkedList.size();
        if(size == 0){
            return;
        }
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < size;i++){
            TreeNode cur = linkedList.pollFirst();
            temp.add(cur.val);
            if(cur.left != null){
                linkedList.addLast(cur.left);
            }
            if(cur.right != null){
                linkedList.addLast(cur.right);
            }
        }
        list.add(temp);
        process(linkedList,list);
    }
}
