package leetcode.hot;

import leetcode.common.TreeNode;

/**
 * @author sunday
 * @create 2023 --- 03 --- 11 --- 14:30
 */
public class 打家劫舍3 {
    public int rob(TreeNode root) {
        Data data = process(root);
        return Math.max(data.no,data.yes);
    }
    public Data process(TreeNode node){
        if(node == null){
            return new Data(0,0);
        }
        Data left = process(node.left);
        Data right = process(node.right);
        return new Data(Math.max(left.yes, left.no) + Math.max(right.yes,right.no),left.no + right.no + node.val);
    }

    class Data{
        int no;
        int yes;

        public Data(int no, int yes) {
            this.no = no;
            this.yes = yes;
        }
    }
}
