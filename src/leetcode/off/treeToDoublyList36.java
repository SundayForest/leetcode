package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 21 --- 15:21
 */
public class treeToDoublyList36 {
//    输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
    Node pre,head;
    public Node treeToDoublyList(Node root) {
        if(root == null){
            return null;
        }
        process(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    public void process(Node node){
        if(node == null){
            return;
        }
        process(node.left);
        if(pre == null){
            head = node;
        }else{
            pre.right = node;
        }
        node.left = pre;
        pre = node;
        process(node.right);
    }
}
