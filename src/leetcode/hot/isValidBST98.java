package leetcode.hot;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 03 --- 05 --- 9:37
 */
public class isValidBST98 {
//    给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        process(list,root);
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) >= list.get(i + 1)){
                return false;
            }
        }
        return true;
    }
    public void process(List<Integer> list,TreeNode node){
        if(node == null){
            return;
        }
        process(list,node.left);
        list.add(node.val);
        process(list,node.right);
    }
}
