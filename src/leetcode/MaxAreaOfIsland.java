package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 11 --- 16:32
 */
public class MaxAreaOfIsland {
    static int now = 0;
    public static int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    help(grid,i,j);
                    max = max > now ? max : now;
                    now = 0;
                }
            }
        }
        return max;
    }

    public static void help(int[][] grid,int i,int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1){
            return;
        }
        now++;
        grid[i][j] = 2;
        help(grid,i + 1, j);
        help(grid,i - 1, j);
        help(grid, i,j + 1);
        help(grid, i,j - 1);
    }
}
