package leetcode.off;

import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 01 --- 27 --- 10:58
 */
public class spiralOrder29 {
//    输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
    public static int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        int[] res = new int[matrix.length * matrix[0].length];
        int rowLow = 0;
        int rowHigh = matrix.length - 1;
        int colLow = 0;
        int colHigh = matrix[0].length - 1;
        int point = 0;
        int method = 0;
        int x = 0;
        int y = -1;
        while (point < res.length){
            if(method == 0){
                if(y < colHigh){
                    res[point++] = matrix[x][++y];
                }else{
                    method = 1;
                    rowLow++;
                }
            }
            if(method == 1){
                if(x < rowHigh){
                    res[point++] = matrix[++x][y];
                }else{
                    method = 2;
                    colHigh--;
                }
            }
            if(method == 2){
                if(y > colLow){
                    res[point++] = matrix[x][--y];
                }else{
                    method = 3;
                    rowHigh--;
                }
            }
            if(method == 3){
                if(x > rowLow){
                    res[point++] = matrix[--x][y];
                }else{
                    method = 0;
                    colLow++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(mat);
    }
}
