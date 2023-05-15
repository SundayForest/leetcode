package look.算法;

/**
 * @author sunday
 * @create 2022 --- 12 --- 18 --- 16:54
 */
public class DivMoney {
//    小朋友按分数分糖果， 一个数组代表他们的分数，每个人，一定要比左边和右边比他分数小的人糖果多，如果分数一样，则可以
//    不管，求 1.线性排列时的最小的糖果数
//            2.排成环的时候的最小的糖果数
    public int processOne(int[] arr){
//        解法： 从左边和右边分别计算这个数是否比旁边的数大，大则加 1 ，小或等于则 等于 1。
        if(arr == null || arr.length == 0){
            return -1;
        }
        int res = 0;
        int[] ans = new int[arr.length];
        ans[0] = 1;
        ans[ans.length - 1] = 1;
        System.out.println(ans[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i - 1]){
                ans[i] = ans[i - 1] + 1;
            }else{
                ans[i] = 1;
            }
            if(arr[arr.length - 1 - i] > arr[arr.length - i]){
                ans[arr.length - 1- i] = Math.max(ans[arr.length - i] + 1,ans[arr.length - 1- i]);
            }
        }
        for(int i = 0; i < ans.length ; i++){
            res += ans[i];
        }
        return res;
    }
    public int processTwo(int[] arr){
//        解法：   先求一个局部最小值，然后以该值为开头结尾，改装原数组，然后就是上面的算法
        if(arr == null || arr.length == 0){
            return -1;
        }
        int point = 0;
        if(arr[0] <= arr[1] && arr[0] <= arr[arr.length - 1]){

        }else {
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] <= arr[i - 1] && arr[i] <= arr[(i + 1)%arr.length]){
                    point = i;
                    break;
                }
            }
        }
        int[] myArr = new int[arr.length + 1];
        myArr[0] = arr[point];
        myArr[myArr.length - 1] = arr[point];
        int p = 1;
        for(int i = point + 1; i < arr.length; i++){
            myArr[p++] = arr[i];
        }
        for(int i = 0; i < point; i++){
            myArr[p++] = arr[i];
        }
        return processOne(myArr) - 1;
    }
}
