package leetcode.hot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 03 --- 15 --- 19:47
 */
public class 找到所有数组中消失的数字448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            while (temp >= 0 && temp <= nums.length && nums[temp - 1] > 0 && nums[temp - 1] <= nums.length){
                int t = nums[temp - 1];
                nums[temp - 1] = - 1;
                temp = t;
//                int t = nums[nums[temp] - 1];
//                nums[nums[temp] - 1] = -1;
//                temp = t;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != -1){
                res.add(i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,7,8,2,3,1};
        findDisappearedNumbers(arr);
    }
}
