package look;

/**
 * @author sunday
 * @create 2022 --- 10 --- 30 --- 19:07
 */
public class GetMax {
    public static int getMax(int[] arr){
        return process(arr,0,arr.length - 1);
    }
    public static int process(int[] arr, int l,int r){
        if(l == r){
            return arr[l];
        }
        int mid = l + (l - r) / 2;
        int leftMax = process(arr,l,mid);
        int rightMax = process(arr,mid + 1,r);
        return Math.max(leftMax,rightMax);
    }
}
