package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 05 --- 14:22
 */
public class FindNumberIn2DArray04Off {
//    在一个 n * m 的二维数组中，每一行都按照从左到右 非递减 的顺序排序，
//    每一列都按照从上到下 非递减 的顺序排序。请完成一个高效的函数，
//    输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
//
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int i = 0;
        int j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] < target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
