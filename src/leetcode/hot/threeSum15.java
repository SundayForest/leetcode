package leetcode.hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 02 --- 17 --- 20:11
 */
public class threeSum15 {
//    给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
//    同时还满足 nums[i] + nums[j] + nums[k] == 0 。
//    请你返回所有和为 0 且不重复的三元组。
    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3){
            return null;
        }
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; ){
            int l = i + 1;
            int r = nums.length - 1;
            if(nums[i] > 0){
                break;
            }
            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l < r && nums[l] == nums[l + 1]){
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]){
                        r--;
                    }
                    l++;
                }else if(sum < 0){
                    l++;
                }else{
                    r--;
                }
            }
            int j = i + 1;
            while (j < nums.length){
                if(nums[j] == nums[i]){
                    j++;
                }else{
                    break;
                }
            }
            i = j;
        }
        return res;
    }

    public static void main(String[] args) {
//        threeSum(new int[]{-1,0,1,2,-1,-4});
        threeSum(new int[]{0,0,0});
    }

}
