package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 02 --- 22 --- 14:17
 */
public class minPathSum64 {
//    给定一个包含非负整数的 m x n网格grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
//
//说明：每次只能向下或者向右移动一步。
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[grid.length - 1][grid[0].length - 1] = grid[grid.length - 1][grid[0].length - 1];
        for(int i = grid.length - 2; i >= 0; i--){
            dp[i][grid[0].length - 1] = grid[i][grid[0].length - 1] + dp[i + 1][grid[0].length - 1];
        }
        for(int j = grid[0].length - 2; j >= 0; j--){
            dp[grid.length - 1][j] = grid[grid.length - 1][j] + dp[grid.length - 1][j + 1];
        }
        for(int i = grid.length - 2; i >= 0; i--){
            for(int j = grid[0].length - 2; j >= 0; j--){
                dp[i][j] = Math.min(dp[i + 1][j],dp[i][j + 1]) + grid[i][j];
            }
        }
        return dp[0][0];
    }
}
