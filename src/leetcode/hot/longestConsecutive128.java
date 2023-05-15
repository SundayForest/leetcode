package leetcode.hot;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sunday
 * @create 2023 --- 03 --- 05 --- 9:49
 */
public class longestConsecutive128 {
//    给定一个未排序的整数数组 nums ，找出数字连续的最长序列
//    （不要求序列元素在原数组中连续）的长度。
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i] - 1)){
                int temp = 1;
                for(int j = nums[i] + 1;;j++){
                    if(set.contains(j)){
                        temp++;
                    }else{
                        break;
                    }
                }
                max = Math.max(max,temp);
            }
        }
        return max;
    }
}
