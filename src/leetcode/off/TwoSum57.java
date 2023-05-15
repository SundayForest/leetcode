package leetcode.off;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author sunday
 * @create 2023 --- 01 --- 20 --- 11:50
 */
public class TwoSum57 {
//      输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。
//      如果有多对数字的和等于s，则输出任意一对即可。
public int[] twoSum(int[] nums, int target) {
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0; i < nums.length && nums[i] < target; i++){
        if(set.contains(target - nums[i])){
            return new int[]{nums[i],target - nums[i]};
        }
        set.add(nums[i]);
    }
    return null;
}
}
