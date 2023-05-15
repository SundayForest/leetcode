package look.中级提升;

import java.util.HashSet;

/**
 * @author sunday
 * @create 2023 --- 02 --- 17 --- 19:24
 */
public class LongsertSonArrCanRate {
//    求一个数组最大的可整合子数组的长度
//    可整合定义： 数组每一个元素排序后依次 + 1
    public int get(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }
        int ans = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.clear();
            for(int j = i; j < arr.length; j++){
                if(set.contains(arr[i])){
                    break;
                }else{
                    max = Math.max(max,arr[j]);
                    min = Math.min(min,arr[j]);
                }
                if(max - min == j - i){
                    ans = Math.max(ans,max - min + 1);
                }
            }
        }
        return ans;
    }
}
