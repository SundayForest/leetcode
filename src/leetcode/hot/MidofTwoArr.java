package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 02 --- 13 --- 11:15
 */
public class MidofTwoArr {
//    给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
    public static double getMid(int[] arr1, int[] arr2){
        int len = arr1.length + arr2.length;
        if(len % 2 == 1){
            return process(arr1,arr2,len / 2);
        }else{
            int num1 = process(arr1,arr2, (len - 1 ) / 2);
            int num2 = process(arr1,arr2, len / 2);
            return num1 + (num2 - num1) * 1.0 / 2;
        }
    }
    public static int process(int[] arr1, int[] arr2,int k){
        int point1 = 0;
        int point2 = 0;
        int n = k / 2;
        int sum = 0;
        while (n > 10){
            if(arr1.length - point1 < n){
                n = arr1.length - point1;
            }else if(arr2.length - point2 < n){
                n = arr2.length - point2;
            }
            if(arr1[point1 + n - 1] < arr2[point2 + n - 1]){
                point1 += n;
            }else{
                point2 += n;
            }
            sum += n;
            n /= 2;
        }
        int res = 0;
        for(int i = sum; i <= k; i++){
            if(point1 == arr1.length){
                return arr2[point2 + k - i];
            }
            if(point2 == arr2.length){
                return arr1[point1 + k - i];
            }
            if(arr1[point1] < arr2[point2]){
                res = arr1[point1];
                point1++;
            }else{
                res = arr2[point2];
                point2++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        System.out.println(getMid(arr1,arr2));
    }
}
