package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 25 --- 13:21
 */
public class verifyPostorder33 {
//    输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。
//    假设输入的数组的任意两个数字都互不相同。
    public boolean verifyPostorder(int[] postorder) {
        return process(postorder,0,postorder.length - 1);
    }
    public boolean process(int[] postorder,int i,int j){
        if(i >= j){
            return true;
        }
        int p = i;
        while (postorder[p] < postorder[j]){
            p++;
        }
        int m = p;
        while (postorder[p] > postorder[j]){
            p++;
        }
        return (p == j) && (process(postorder,i,m - 1)) && process(postorder,m,j - 1);
    }
}
