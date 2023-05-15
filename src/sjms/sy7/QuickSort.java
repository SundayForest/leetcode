package sjms.sy7;

/**
 * @author sunday
 * @create 2023 --- 04 --- 10 --- 11:23
 */
public class QuickSort {
    public  void quickSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        process1(arr,0,arr.length-1);
    }
    private  void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private  void process1(int[] arr,int l, int r){
        if(l >= r){
            return;
        }
        int[] h = process2(arr, l, r);
        process1(arr,l,h[0] - 1);
        process1(arr,h[1] + 1,r);
    }
    private  int[] process2(int[] arr,int l ,int r){
        if(l > r){
            return new int[]{-1,-1};
        }
        if(l == r){
            return new int[]{l,r};
        }
        int less = l - 1;
        int more = r;
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
}
