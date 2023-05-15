package leetcode;

/**
 * @author sunday
 * @create 2022 --- 10 --- 29 --- 22:26
 */
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，
// 返回它将会被按顺序插入的位置。
//
//请必须使用时间复杂度为 O(log n) 的算法。

//链接：https://leetcode.cn/problems/search-insert-position

public class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
//        System.out.println(searchInsert(arr,3));
        searchInsert(arr,1);
    }
    public static int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0 || nums[0] > target){
            return 0;
        }
        if(nums[nums.length-1] < target){
            return nums.length;
        }
        int low = 0;
        int high = nums.length - 1;
        int point = 0;
        while (true){
            point = low + (high - low) / 2;
            if(nums[point] == target){
                return point;
            }
            if(nums[point] < target){
                if (nums[point + 1] >= target){
                    return point + 1;
                }
                low = point;
            }else{
                if(nums[point - 1] < target){
                    return point -1;
                }else if(nums[point - 1] == target){
                    return point - 1;
                }
                high = point;
            }
        }
    }
}
