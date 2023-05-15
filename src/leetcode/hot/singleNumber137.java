package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 04 --- 14:41
 */
public class singleNumber137 {
//    给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。
//    请你找出并返回那个只出现了一次的元素。
//    你必须设计并实现线性时间复杂度的算法且不使用额外空间来解决此问题。

    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int res = 0;
        for(int i = 0; i < 32; i++){
            int temp = 0;
            for(int j = 0; j < nums.length; j++){
                temp += ( 1 & nums[j] >> 31 - i);
            }
            res += (temp % 3) << (31 - i);
        }
        return res;
    }
}
