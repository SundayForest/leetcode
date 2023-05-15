package look;

/**
 * @author sunday
 * @create 2022 --- 10 --- 31 --- 14:20
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,4,7,1,25,5,6,7,2,6,8,9,5,7,4,7};
        mergeSort(arr);
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void mergeSort(int[] arr){
        process(arr,0,arr.length - 1);
    }
//    使 arr 从 l 到 r 范围上变得有序
    public static void process(int[] arr,int l,int r){
        if(l == r){
            return;
        }
        int mid = l + (r - l) / 2;
        process(arr,l,mid);
        process(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void merge(int[] arr,int l,int mid, int r){
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        while(p1 <= mid && p2 <= r){
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while(p1 <= mid){
            help[i++] = arr[p1++];
        }
        while(p2 <= r){
            help[i++] = arr[p2++];
        }
        for (int j = 0; j < help.length; j++){
            arr[l + j] = help[j];
        }
    }
}
