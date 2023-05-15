package leetcode.off;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author sunday
 * @create 2023 --- 01 --- 05 --- 19:23
 */
public class LevelOrder32 {
//    从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。

    public int[] levelOrder2(TreeNode root) {
        if(root == null){
            return new int[]{};
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null) {
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        int[] ints = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ints[i] = list.get(i);

        }
        return ints;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> res = new ArrayList<>();
        while (!queue.isEmpty()){
            Queue<TreeNode> queue1 = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            while (!queue.isEmpty()){
                if(queue.peek() != null){
                    list.add(queue.peek().val);
                    queue1.add(queue.peek().left);
                    queue1.add(queue.poll().right);
                }else{
                    queue.poll();
                }
            }
            if(list.size() != 0){
                res.add(list);
            }
            queue = queue1;
        }
        return res;
    }
    public List<List<Integer>> levelOrder3(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int point = 1;
        List<List<Integer>> res = new ArrayList<>();
        while (!queue.isEmpty()){
            Queue<TreeNode> queue1 = new LinkedList<>();
            List<Integer> list = new ArrayList<>();

            while (!queue.isEmpty()){
                if(queue.peek() != null){
                    list.add(queue.peek().val);
                    queue1.add(queue.peek().left);
                    queue1.add(queue.poll().right);
                }else{
                    queue.poll();
                }
            }
            if(list.size() != 0){
                if(point % 2 == 0){
                    List<Integer> list1 = new ArrayList<>();
                    for(int i = list.size() - 1; i > -1; i--){
                        list1.add(list.get(i));
                    }
                    res.add(list1);
                }else{
                    res.add(list);
                }
            }
            queue = queue1;
            point++;
        }
        return res;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
