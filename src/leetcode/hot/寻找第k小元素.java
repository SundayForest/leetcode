package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 12 --- 14:53
 */
public class 寻找第k小元素 {
    public int findKthLargest(int[] nums, int k) {
        return 0;
    }
    public void heapSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for(int i = 0; i < arr.length; i++){
            heapInsert(arr,i);
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0){
            heapify(arr,0,heapSize);
            swap(arr,0,--heapSize);
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void heapInsert(int[] arr,int index){
        int p;
        while (arr[index] > arr[p = ((index - 1) >> 1)]){
            swap(arr,index,p);
            index = p;
        }
    }
    public void heapify(int[] arr,int index,int size){
        int left = index * 2 + 1;
        while (left < size){
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[index] > arr[largest] ? index : largest;
            if(largest == index){
                return;
            }
            swap(arr,largest,index);
            index = largest;
            left = index * 2 + 1;
        }
    }
}

