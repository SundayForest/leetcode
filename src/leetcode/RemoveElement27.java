package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 21 --- 3:19
 */
public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        int j = nums.length;
        for(int i = 0; i < j; i++){
            if(nums[i] == val){
                int temp = nums[i];
                nums[i--] = nums[--j];
                nums[j] = temp;
            }
        }
        return j;
    }
}
