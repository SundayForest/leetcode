package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 02 --- 22 --- 14:24
 */
public class climbStairs70 {
//    假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
//每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[0] = 1;
        return process(n,dp);
    }
    public int process(int n,int[] dp){
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = process(n  - 1,dp) + process(n - 2,dp);
        return dp[n];
    }
}
