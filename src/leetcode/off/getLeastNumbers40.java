package leetcode.off;

import java.util.Arrays;

/**
 * @author sunday
 * @create 2023 --- 01 --- 21 --- 21:02
 */
public class getLeastNumbers40 {
//    输入整数数组 arr ，找出其中最小的 k 个数。
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr.length == 0){
            return new int[0];
        }
        Arrays.sort(arr);
        int[] ar = new int[k];
        for(int i = 0; i < k; i++){
            ar[i] = arr[i];
        }
        return ar;
    }
}
