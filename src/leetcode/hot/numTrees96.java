package leetcode.hot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 02 --- 24 --- 21:36
 */
public class numTrees96 {
    public static int numTrees(int n) {
        int[][] arr = new int[n + 1][n + 1];
        arr[1][1] = 1;
        return process(1,n, arr);
    }
    public static int process(int index,int length,int[][] dp){
        if(dp[index][length] != 0){
            return dp[index][length];
        }
        if(length == 0){
            return 0;
        }
        int res = 0;
        for(int i = 1; i <= index; i++){
            res += process(i,index - 1,dp);
        }
        for(int i = 1; i <= length - index; i++){
            res += process(i,  length - index,dp);
        }
        dp[index][length] = res;
        return res;
    }

    public static void main(String[] args) {
        numTrees(3);
        System.out.println(numTrees(2));
        System.out.println(numTrees(1));
        System.out.println(numTrees(3));
    }
}
