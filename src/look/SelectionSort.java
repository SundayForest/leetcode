package look;

/**
 * @author sunday
 * @create 2022 --- 10 --- 29 --- 15:57
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,7,1,25,5,6,7,2,6,8,9,5,7,4,7};
        selectSort(arr);
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void selectSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
//        排除特殊数组
        for(int i = 0; i < arr.length-1;i++){
            int min = i;
            for(int j = i + 1; j < arr.length;j++){
                min = arr[j] < arr[min] ? j : min;
            }
//            从0到末尾找到最小值
            swap(arr,i,min);
//            交换
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
