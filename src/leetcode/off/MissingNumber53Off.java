package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 02 --- 11:02
 */
public class MissingNumber53Off {
//    一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
//    在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字

    public int missingNumber(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int point = low + (high - low) / 2;
        while(low <= high){
            if(high - low < 10){
                for(int i = low; i <= high; i++){
                    if(nums[i] == i + 1){
                        return i;
                    }
                }
            }
            if(nums[point] - nums[point - 1] == 2){
                return point;
            }else if(nums[point] == point){
                low = point;
                point = low + (high - low) / 2;
            }else{
                high = point;
                point = low + (high - low) / 2;
            }
        }
        return 0;
    }
}
