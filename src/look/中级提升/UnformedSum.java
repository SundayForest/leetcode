package look.中级提升;

/**
 * @author sunday
 * @create 2023 --- 02 --- 16 --- 19:35
 */
public class UnformedSum {
//    求一个数组，最小子集和 和 全集和 之间，最小不可得到的子集累加和
    public int unformedSum(int[] arr){
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            min = Math.min(min,arr[i]);
            sum += arr[i];
        }
        int n = arr.length;
        boolean[][] dp = new boolean[n][sum+1];
        dp[0][arr[0]] = true;
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j < sum + 1; j++){
                if(dp[i - 1][j]){
                    dp[i][j] = true;
                }else if(arr[i] == j){
                    dp[i][j] = true;
                }else if(j - arr[i] >= 0 && dp[i - 1][j - arr[i]]){
                    dp[i][j] = true;
                }
            }
        }
        for(int i = min; i <= sum; i++){
            if(!dp[arr.length - 1][i]){
                return i;
            }
        }
        return sum + 1;
    }
}
