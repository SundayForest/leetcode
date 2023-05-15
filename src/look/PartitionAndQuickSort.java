package look;

/**
 * @author sunday
 * @create 2022 --- 10 --- 31 --- 19:57
 */
public class PartitionAndQuickSort {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
//   在 arr 的 l 到 r 上做荷兰国旗问题,以 arr[r] 为划分
    public static int[] netherlandsFlag(int[] arr,int l ,int r){
        if(l > r){
            return new int[]{-1,-1};
        }
        if(l == r){
            return new int[]{l,r};
        }
        int less = l - 1; // < 右边界
        int more = r;     // > 左边界
        int index = l;
        while (index < more){
            if(arr[index] == arr[r]){
                index++;
            }else if(arr[index] < arr[r]){
                swap(arr,index++,++less);
            }else{
                swap(arr,index,--more);
            }
        }
        swap(arr,more,r);
        return new int[]{less + 1,more};
    }
    public static void quickSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        process(arr,0,arr.length-1);
    }
    public static void process(int[] arr,int l, int r){
        if(l >= r){
            return;
        }
        int[] h = netherlandsFlag(arr, l, r);
        process(arr,l,h[0] - 1);
        process(arr,h[1] + 1,r);
    }
}
