package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 07 --- 11:42
 */
public class MirrorTree27 {
//    请完成一个函数，输入一个二叉树，该函数输出它的镜像。
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }
        help(root);
        return root;
    }
    public void help(TreeNode node){
        if(node == null){
            return;
        }
        TreeNode treeNode = node.right;
        node.right = node.left;
        node.left = treeNode;
        help(node.right);
        help(node.left);
    }
}
