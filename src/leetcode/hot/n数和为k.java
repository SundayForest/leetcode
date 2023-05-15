package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 09 --- 15:42
 */
public class n数和为k {
    public static int work(int[] arr, int target){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        if(sum < target){
            return 0;
        }
        if(sum == target){
            return 1;
        }
        int[][] dp = new int[arr.length + 1][target + 1];
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 1;
        }
        for(int i = 1; i <= arr.length; i++){
            for(int j = 1; j <= arr.length; j++){
                dp[i][j] = dp[i - 1][j];
                int p;
                if((p = (j - arr[i - 1])) >= 0){
                    dp[i][j] += dp[i - 1][p];
                }
            }
        }
        return dp[arr.length][target];
    }
    public static void main(String[] args) {
        System.out.println(work(new int[]{1, 2, 3},3));
        work(new int[]{1, 2, 3},3);
    }
}
