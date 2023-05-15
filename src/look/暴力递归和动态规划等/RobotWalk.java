package look.暴力递归和动态规划等;

import java.util.Stack;

/**
 * @author sunday
 * @create 2022 --- 11 --- 15 --- 20:56
 */
public class RobotWalk {
//    机器人从 1 ~ N 走，1 只能到 2 ， N 只能到 N - 1
//    从 M 点出发，还剩 K 步，最终能到达 P 点的方法数
    public static int way1(int N,int M,int K,int P){
        if(N < 2 || K < 1 || M < 1 || M > N || P < 1 || P > N){
            return 0;
        }
        int[][] dp = new int[N+1][K+1];
        for (int i = 0; i <= N;i++){
            for(int j = 0;j <= K; j++){
                dp[i][j] = -1;
            }
        }
//        return walk1(N,M,K,P);
        return walk2(N,M,K,P,dp);
    }
//  动态规划优化过后的版本
    public static int walk2(int n,int cur,int rest,int p, int[][] dp){
        if(dp[cur][rest] != -1){
            return dp[cur][rest];
        }
        if(rest == 0){
            dp[cur][rest] = cur == p ? 1 : 0;
            return dp[cur][rest];
//            没有步数了，判断走到了没有
        }
        if(cur == 1){
            dp[cur][rest] = walk2(n,2,rest-1,p,dp);
            return dp[cur][rest];
        }
        if(cur == n){
            dp[cur][rest] =  walk2(n,n-1,rest-1,p,dp);
            return dp[cur][rest];
        }
        dp[cur][rest] = walk2(n,cur+1,rest-1,p,dp) + walk2(n, cur-1,rest-1,p,dp);
        return dp[cur][rest];
    }


//====================================================================================================
    public static int walk1(int n,int cur,int rest,int p){
        if(rest == 0){
            return cur == p ? 1 : 0;
//            没有步数了，判断走到了没有
        }
        if(cur == 1){
            return walk1(n,2,rest-1,p);
        }
        if(cur == n){
            return walk1(n,n-1,rest-1,p);
        }
        return walk1(n,cur+1,rest-1,p) + walk1(n, cur-1,rest-1,p);
    }



}
