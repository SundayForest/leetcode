package leetcode.off;

import java.util.Arrays;

/**
 * @author sunday
 * @create 2023 --- 01 --- 30 --- 10:54
 */
public class nixudui {
//    求逆序对
    public static int nixudui(int[] arr){
        if(arr == null || arr.length < 2){
            return 0;
        }
        int[] help = new int[arr.length];
        int res = 0;
        help[help.length - 1] = 0;
        for(int i = arr.length - 2; i >= 0; i--){
            int j = i + 1;
            while (j < arr.length){
                if(arr[i] == arr[j]){
                    help[i] = help[j];
                }else if(arr[i] < arr[j]){
                    j++;
                }else{
                    help[i] += help[j] + 1;
                    j += help[j] + 1;
                }
            }
            res += help[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,7,1};
//        int[] sorts = Arrays.sort(arr , (a,b) -> (a - b));
        System.out.println(nixudui(arr));
    }
}
