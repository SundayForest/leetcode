package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 13 --- 19:13
 */
public class 除自身外最大数组乘积238 {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        pre[0] = nums[0];
        int[] aft = new int[nums.length];
        aft[aft.length - 1] = nums[aft.length - 1];
        for(int i = 1; i < nums.length; i++){
            pre[i] = pre[i - 1] * nums[i];
            aft[aft.length - i - 1] = aft[aft.length - i] * nums[aft.length - i- 1];
        }
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int temp = 1;
            if(i > 0){
                temp *= pre[i - 1];
            }
            if(i < nums.length - 1){
                temp *= aft[i + 1];
            }
            res[i] = temp;
        }
        return res;
    }
}
