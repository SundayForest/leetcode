package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 08 --- 19:01
 */
public class 零一背包 {
    public int package01(int[] value,int[] height,int contain){
        if(value.length == 0 || height.length == 0 || value.length != height.length){
            return 0;
        }
        int[][] dp = new int[value.length + 1][contain + 1];
        for(int i = 1; i < value.length + 1; i++){
            for(int j = 1; j < contain + 1; j++){
                int temp = 0;
                if(j - height[i - 1] > 0){
                    temp = dp[i - 1][j - height[i - 1]];
                }
                dp[i][j] = Math.max(dp[i-1][j],temp + value[i - 1]);
            }
        }
        return dp[value.length][contain];
    }

}
class TestPack{
    public static void main(String[] args) {
        int[] value = {100,200,300,100};
        int[] height = {4,2,3,9};
        System.out.println(new 零一背包().package01(value,height,5));
        零一背包 p = new 零一背包();
        p.package01(value,height,5);
    }
}
