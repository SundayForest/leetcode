package leetcode.off;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author sunday
 * @create 2023 --- 01 --- 26 --- 12:36
 */
public class findContinuousSequence57 {
//    输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
//
//序列内的数字由小到大排列，不同序列按照首个数字从小到大排列
public int[][] findContinuousSequence(int target) {
    int i = 1;
    int j = 1;
    int sum = 0;
    List<int[]> res = new ArrayList<>();
    while (i <= target / 2) {
        if (sum < target) {
            sum += j;
            j++;
        } else if (sum > target) {
            sum -= i;
            i++;
        } else {
            int[] arr = new int[j-i];
            for (int k = i; k < j; k++) {
                arr[k-i] = k;
            }
            res.add(arr);
            sum -= i;
            i++;
        }
    }
    return res.toArray(new int[res.size()][]);
}
}
