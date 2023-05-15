package leetcode.off;

import java.util.Arrays;

/**
 * @author sunday
 * @create 2023 --- 01 --- 21 --- 15:54
 */
public class minNumber45 {
//    输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
//    本题关键在于，由条件想到，a + b < b + a ,由此来排序
public String minNumber(int[] nums) {
    String[] strs = new String[nums.length];
    for(int i = 0; i < nums.length; i++)
        strs[i] = String.valueOf(nums[i]);
    Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
    String res = "";
    for(String s : strs)
        res+=s;
    return res;
}
}
