package look.基础提升.暴力递归改动态规划而且范围尝试下半个矩阵没用;

/**
 * @author sunday
 * @create 2023 --- 01 --- 25 --- 10:39
 */
public class HouseJump {
//    象棋，马要去一个地方，一定要走 x 步，求可能的数量
    int getWays(int x,int y,int k){
        return process(x,y,k);
    }
//    题意转化潜台词：从 （0，0）出发，
//    去往（x，y）
//    必须 x 步，求方法数
    int process(int x,int y,int step){
        if(x < 0 || y < 0 || x > 8 || y > 9){
            return 0;
        }
        if(step == 0){
            return (x == 0 && y == 0) ? 1 : 0;
        }
        return process(x - 1, y + 2, step - 1) +
                process(x + 1, y + 2, step - 1) +
                process(x - 1, y - 2, step - 1) +
                process(x + 1, y - 2, step - 1) +
                process(x - 2, y + 1, step - 1) +
                process(x + 2, y + 1, step - 1) +
                process(x - 2, y - 1, step - 1) +
                process(x + 2, y - 1, step - 1);
    }
//    此题 dp 用一个三维数组存起来即可
    int dp(int x,int y,int step){
        if(x < 0 || y < 0 || x > 8 || y > 9){
            return 0;
        }
        int[][][] dp = new int[9][10][step+1];
        dp[0][0][0] = 1;
//        只依赖下一层，随意怎么顺序走，第 0 层永远只有000 为 1
        for(int h = 1; h <= step; h++){
            for (int r = 0; r < 9; r++){
                for (int c = 0; c < 10; c++){
                    dp[r][c][h] += getValue(dp,x-1,y-2,h-1);
                    dp[r][c][h] += getValue(dp,x-1,y+2,h-1);
                    dp[r][c][h] += getValue(dp,x+1,y-2,h-1);
                    dp[r][c][h] += getValue(dp,x+1,y+2,h-1);
                    dp[r][c][h] += getValue(dp,x-2,y+1,h-1);
                    dp[r][c][h] += getValue(dp,x+2,y+1,h-1);
                    dp[r][c][h] += getValue(dp,x-2,y-1,h-1);
                    dp[r][c][h] += getValue(dp,x+2,y-1,h-1);
                }
            }
        }
        return dp[x][y][step];
    }
    int getValue(int[][][] dp,int x,int y,int step){
        if(x < 0 || y < 0 || x > 8 || y > 9){
            return 0;
        }
        return dp[x][y][step];
    }
}
