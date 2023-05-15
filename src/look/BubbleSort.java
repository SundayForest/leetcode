package look;

/**
 * @author sunday
 * @create 2022 --- 10 --- 29 --- 16:07
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,7,1,25,5,6,7,2,6,8,9,5,7,4,7};
        bubbleSort(arr);
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for(int e = arr.length-1;e>0;e--){
//            每次执行一次，最后一个就ok
            for(int i = 0; i < e;i++){
                if(arr[i] > arr[i + 1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
