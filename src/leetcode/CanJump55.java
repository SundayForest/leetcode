package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 19 --- 22:25
 */
//给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
//
//数组中的每个元素代表你在该位置可以跳跃的最大长度。
//
//判断你是否能够到达最后一个下标。
public class CanJump55 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
    }
    public boolean canJump(int[] nums) {
        if(nums.length <= 1){
            return true;
        }
        for (int i = 0;i < nums.length ; ){
            if(i + nums[i] + 1 >= nums.length){
                return true;
            }
            int j  = max(nums,i);
            if(i == j){
                return false;
            }
            i = j;
        }
        return true;
    }
    public int max(int[] nums,int index){
        int max = index;
        for(int i = index + 1; i <= index + nums[index]; i++){
            if(i == nums.length){
                return nums.length;
            }
            max = max + nums[max] >= i + nums[i] ? max : i;
        }
        return max;
    }
}
