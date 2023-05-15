package leetcode.hot;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 03 --- 04 --- 18:32
 */
public class Cx2 {
    public int[][] work(TreeNode node){
        List<int[]> list = new ArrayList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        if(node != null){
            linkedList.add(node);
        }
        while (!linkedList.isEmpty()){
            int size = linkedList.size();
            int[] temp = new int[size];
            for(int i = 0; i < size; i++){
                TreeNode cur = linkedList.pollFirst();
                temp[i] = cur.val;
                if(cur.left != null){
                    linkedList.addLast(cur.left);
                }
                if(cur.right != null){
                    linkedList.addLast(cur.right);
                }
            }
            list.add(temp);
        }
        int[][] arr = new int[list.size()][];
        for(int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
class Testcx{
    public static void main(String[] args) {
        Cx2 cx2 = new Cx2();
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n5.right = n7;
        int[][] ar = cx2.work(n1);
        for(int i = 0; i < ar.length; i++){
            for (int j = 0; j < ar[i].length; j++){
                System.out.print(ar[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
