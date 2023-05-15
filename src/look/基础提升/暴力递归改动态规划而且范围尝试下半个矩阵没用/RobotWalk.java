package look.基础提升.暴力递归改动态规划而且范围尝试下半个矩阵没用;

/**
 * @author sunday
 * @create 2023 --- 01 --- 24 --- 17:03
 */
public class RobotWalk {
//    机器人走路
    int walkway(int n,int p,int m,int k){
        return f(n,p,m,k);
    }
//    n 多少位置
//    最终目标 p
//    当前 k
//    还剩 m
    int f(int n,int p,int m,int k){
        if(m == 0){
            return k == p ? 1 : 0;
        }
        if(k == 1){
            return f(n,p,m - 1,2);
        }
        if(k == n){
            return f(n,p,m - 1,k - 1);
        }
//        上面是 头和尾
//        下面是中间位置
        return f(n,p,m - 1,k - 1) + f(n,p,m - 1,k + 1);
    }
    int walk2(int n,int p,int m,int k){
        int [][] dp = new int[k + 1][n + 1];
        return f2(n,p,m,k,dp);
    }
    int f2(int n,int p,int m,int k,int[][] dp){
//        记录下来
        return 0;
    }
}
