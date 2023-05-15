package leetcode.off;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 01 --- 26 --- 11:59
 */
public class majorityElement39 {
//    数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
//    2 2 3 3 4

    public int majorityElement(int[] nums) {
        int now = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                now = nums[i];
            }
            if(nums[i] == now){
                count++;
            }else{
                count--;
            }
        }
        return now;
    }
}
