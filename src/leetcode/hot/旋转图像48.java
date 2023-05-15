package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 15 --- 20:11
 */
public class 旋转图像48 {
    public static void rotate(int[][] matrix) {
        int c = 0;
        int length = 0;
        int n = matrix.length;
        for (; c < n >> 1; c++){
            for (length = 0;length < (n + 1) / 2;length++){
                int temp1 = matrix[length][n - 1 - c];
                matrix[length][n - 1 - c] = matrix[c][length];
                int temp2 = matrix[n - 1 - c][n - length - 1];
                matrix[n - 1 - c][n - length - 1] = temp1;
                matrix[c][length] = matrix[n - length - 1][c];
                matrix[n - length - 1][c] = temp2;
            }
        }
    }

    public static void main(String[] args) {
//        int[][] arr = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
    }
}
