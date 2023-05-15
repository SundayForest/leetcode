package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 06 --- 22:16
 */
public class count {
    public static int count = 0;
    public int work(int target){
        int[] arr = new int[]{1,2,5};
        boolean[][] dp = new boolean[arr.length][target];
        process(target,0,arr,dp);
        return count;
    }
    public void process(int target,int index,int[] arr,boolean[][] dp){
        if(index == arr.length){
            return;
        }
        if(dp[index][target]){
            count++;
            return;
        }
        if(target == 0){
            count++;
            dp[index][target] = true;
            return;
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0;j * arr[i] <= target; j++){
                process(target - j * arr[i],index + 1, arr,dp);
            }
        }
    }
}
class CountTest{
    public static void main(String[] args) {
        count c = new count();
        System.out.println(c.work(10));
    }
}
