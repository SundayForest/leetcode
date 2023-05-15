package leetcode.hot;

import leetcode.common.TreeNode;

/**
 * @author sunday
 * @create 2023 --- 03 --- 07 --- 17:15
 */
public class sortedArrayToBST0402 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        int mid = (nums.length - 1) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        process(root,0,mid - 1,mid + 1,nums.length - 1,nums);
        return root;
    }
    public void process(TreeNode node,int x1,int y1,int x2,int y2,int[] nums){
        if(x1 > y1){
            node.left = null;
        }else{
            int m1 = x1 + (y1 - x1) / 2;
            TreeNode left = new TreeNode(nums[m1]);
            node.left = left;
            process(left,x1,m1 - 1,m1 + 1,y1,nums);
        }
        if(x2 > y2){
            node.right = null;
        }else{
            int m2 = x2 + (y2 - x2) / 2;
            TreeNode right = new TreeNode(nums[m2]);
            node.right = right;
            process(right,x2,m2 - 1,m2 + 1,y2,nums);
        }
    }
}

class ST{
    public static void main(String[] args) {
        sortedArrayToBST0402 s = new sortedArrayToBST0402();
        s.sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
}