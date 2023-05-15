package leetcode.hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 02 --- 21 --- 23:03
 */
public class merge56 {
//    以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
//    请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
//
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        int[] arr = new int[2];
        for(int i = 0; i < intervals.length; ){
            arr[0] = intervals[i][0];
            arr[1] = intervals[i][1];
            int j = i + 1;
            while ( j < intervals.length){
                if(intervals[j][0] <= arr[1]){
                    arr[1] = Math.max(arr[1],intervals[j][1]);
                    j++;
                }else{
                    break;
                }
            }
            list.add(new int[]{arr[0],arr[1]});
            i = j;
        }
        int[][] res = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] m = new int[][]{{0,1},{3,2},{2,1}};
        merge(m);
    }
}
