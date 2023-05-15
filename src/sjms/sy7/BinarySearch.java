package sjms.sy7;

import java.util.Arrays;

/**
 * @author sunday
 * @create 2023 --- 04 --- 10 --- 11:27
 */
public class BinarySearch {
    public int binarySearch(int[] arr,int target){
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        int low = 0;
        int high = arr.length - 1;
        int point = (low + high) >>> 1;
        while (high - low < 20){
            if(target == arr2[point]){
                return  point;
            }
            else if(arr2[point] < target){
                low = point;
            }
            else{
                high = point;
            }
            point = (low + high) >>> 1;
        }
        for(;low <=high ;low++){
            if(arr2[low] == target){
                return low;
            }
        }
        return  -1;
    }
}
