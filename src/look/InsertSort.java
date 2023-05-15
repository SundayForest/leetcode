package look;

/**
 * @author sunday
 * @create 2022 --- 10 --- 29 --- 18:19
 */
public class InsertSort {
//    插入排序
    public static void main(String[] args) {
        int[] arr = {3,4,7,1,25,5,6,7,2,6,8,9,5,7,4,7};
        insertSort(arr);
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void insertSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        for(int i = 1; i < arr.length; i++){
//            做到 0 ~ i 范围内有序
            for(int j = i - 1; j >=0 && arr[j] > arr[j + 1]; j--){
//                当这个数还未走到尽头且比后面的数大，则交换
                swap(arr,j,j+1);
            }
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
