package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 21 --- 3:24
 */
public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length - 1;i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
