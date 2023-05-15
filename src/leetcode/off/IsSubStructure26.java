package leetcode.off;



/**
 * @author sunday
 * @create 2023 --- 01 --- 05 --- 20:13
 */
public class IsSubStructure26 {
//    输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
//
//B是A的子结构， 即 A中有出现和B相同的结构和节点值。
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B == null || A == null){
            return false;
        }
        while(find(A,B) != null){
            TreeNode node = find(A,B);
            boolean res = isSame(node,B);
            if(res){
                return res;
            }else{
                node.val = -10000;
            }
        }
        return false;
    }
    public TreeNode find(TreeNode treeNode,TreeNode target){
        if(treeNode == null){
            return treeNode;
        }
        if(target.val == treeNode.val){
            return treeNode;
        }
        TreeNode node = find(treeNode.left,target);
        if(node == null){
            return find(treeNode.right,target);
        }else{
            return node;
        }
    }
    public boolean isSame(TreeNode a,TreeNode b){
        if(( a == null && b != null)||(b != null && b.val != a.val)){
            return false;
        }
        if(b == null){
            return true;
        }
        boolean res = isSame(a.left,b.left);
        if(res){
            return isSame(a.right,b.right);
        }else{
            return res;
        }
    }
}
