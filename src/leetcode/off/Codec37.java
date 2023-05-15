package leetcode.off;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author sunday
 * @create 2023 --- 01 --- 28 --- 10:58
 */
public class Codec37 {
    public static void main(String[] args) {
        Codec codec = new Codec();
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);
        TreeNode node7 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node2.right = null;
        node2.left = null;
        node3.left = node4;
        node3.right = node5;
        node4.left = node6;
        node4.right = node7;
        String s = codec.serialize(node1);
        System.out.println(s);
        codec.deserialize(s);
    }
//    请实现两个函数，分别用来序列化和反序列化二叉树。
//
//    你需要设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
public static class Codec {
    public String serialize(TreeNode root) {
        if(root == null){
            return "null";
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        String res = "";
        while (!queue.isEmpty()){
            if(queue.peek() == null){
                res += ",null";
                queue.poll();
            }else{
                res += "," + queue.peek().val;
                queue.add(queue.peek().left);
                queue.add(queue.poll().right);
            }
        }
        return res.substring(1);

    }
    public TreeNode deserialize(String data) {
        if(data.equals("null")){
            return null;
        }
        String[] strings = data.split(",");
        int index= 1;
        TreeNode head = new TreeNode(Integer.parseInt(strings[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        while (index < strings.length){
            TreeNode node = queue.poll();
            if(node == null){
                continue;
            }
            if(strings[index].equals("null")){
                node.left = null;
                index++;
            }else{
                TreeNode left = new TreeNode(Integer.parseInt(strings[index++]));
                node.left = left;
            }
            if(index == strings.length ||  strings[index].equals("null")){
                node.right = null;
                index++;
            }else{
                TreeNode right = new TreeNode(Integer.parseInt(strings[index++]));
                node.right = right;
            }
            queue.offer(node.left);
            queue.offer(node.right);
        }
        return head;
    }

}
}
