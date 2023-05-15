package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 12 --- 11:33
 */
public class 岛屿数量200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1'){
                    count++;
                    process(grid,i,j);
                }
            }
        }
        return count;
    }
    public void process(char[][] grid,int i,int j){
        if(i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = 2;
        process(grid,i - 1,j);
        process(grid,i + 1,j);
        process(grid,i,j - 1);
        process(grid,i,j + 1);
    }
}
