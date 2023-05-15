package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 15 --- 21:18
 */
public class 寻找重复数287 {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while (fast != slow){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
