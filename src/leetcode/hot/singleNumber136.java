package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 03 --- 14:20
 */
public class singleNumber136 {
//    给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
}
