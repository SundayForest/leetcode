package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 26 --- 12:23
 */
public class constructArr {
//    给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积,
//    即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
    public static int[] constructArr(int[] a) {
        if(a==null || a.length == 0){
            return a;
        }
        int[] res = new int[a.length];
        int[] pre = new int[a.length];
        int[] aft = new int[a.length];
        pre[0] = a[0];
        aft[aft.length - 1] = a[a.length - 1];
        for(int i = 1; i < pre.length; i++){
            pre[i] = pre[i - 1] * a[i];
            aft[a.length - 1 - i] = aft[a.length - i] * a[a.length - 1 - i];
        }
        for(int i = 1; i < a.length - 1; i++){
            res[i] = aft[i + 1] * pre[i - 1];
        }
        res[0] = aft[1];
        res[res.length - 1] = pre[res.length - 2];
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        constructArr(a);
    }
}
