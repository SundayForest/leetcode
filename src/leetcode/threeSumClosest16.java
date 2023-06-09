package leetcode;

import java.util.Arrays;

/**
 * @author sunday
 * @create 2023 --- 02 --- 21 --- 18:18
 */
public class threeSumClosest16 {
//    给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
//
//返回这三个数的和。
//
//假定每组输入只存在恰好一个解。
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high){
                if(Math.abs(nums[low] + nums[high] + nums[i] - target) < Math.abs(target - res)){
                    res = nums[low] + nums[high] + nums[i];
                }
                if(nums[low] + nums[high] + nums[i] < target){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return res;
    }
}
