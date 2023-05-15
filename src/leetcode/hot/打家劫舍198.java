package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 09 --- 16:28
 */
public class 打家劫舍198 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[1] = nums[0];
        int max = dp[1];
        for(int i = 2; i < dp.length; i++){
            dp[i] = Math.max(dp[i - 1],dp[i - 2] + nums[i - 1]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
    public static int rob2(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length + 1];
        dp[1] = nums[0];
        int max = dp[1];
        for(int i = 2; i < dp.length - 1; i++){
            dp[i] = Math.max(dp[i - 1],dp[i - 2] + nums[i - 1]);
            max = Math.max(max,dp[i]);
        }
        dp[1] = 0;
        dp[2] = nums[1];
        max = Math.max(max,dp[2]);
        for(int i = 3; i < dp.length; i++){
            dp[i] = Math.max(dp[i - 1],dp[i - 2] + nums[i - 1]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2};
        rob2(arr);
        System.out.println(rob2(arr));
    }
}
