package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 13 --- 14:28
 */
public class MaxSubArray42 {
//    输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
//    要求时间复杂度为O(n)
    public int maxSubArray(int[] nums) {
        int pro = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] + pro > nums[i]){
                pro += nums[i];
            }else{
                pro = nums[i];
            }
            max = Math.max(pro,max);
        }
        return max;
    }
}
