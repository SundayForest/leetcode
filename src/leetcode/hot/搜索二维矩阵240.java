package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 13 --- 19:38
 */
public class 搜索二维矩阵240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0){
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
