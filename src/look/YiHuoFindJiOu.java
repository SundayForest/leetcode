package look;

/**
 * @author sunday
 * @create 2022 --- 10 --- 29 --- 16:20
 */
public class YiHuoFindJiOu {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1,5};
        int[] arr2 = {1,2,2,1,6,5};
        find1(arr1);
        find2(arr2);
    }
    public static void find1(int[] arr){
        int eor = 0;
        for(int i = 0; i < arr.length; i++){
            eor ^= arr[i];
        }
        System.out.println(eor);
//        题目一个数组，一个数只出现了奇数次，其他数出现了偶数次·，找到那个奇数次
//        解法思路：异或，使偶数次都相互抵消，最后剩下的就是
    }
    public  static void find2(int[] arr){
        int eor = 0;
        for(int i = 0; i < arr.length; i++){
            eor ^= arr[i];
        }
//        eor = a ^ b
//        eor != 0
//        eor 必有一位上为1
        int rightOne = eor & (~eor + 1);
//        提取出最右的1
        int eor2 = 0;
        for(int i : arr){
             if((i & rightOne)==0){
                 eor2 ^= i;
             }
//             提取出其中一种在那一位上为0 的数进行异或，结果为a或b
        }
        System.out.println(eor2 + "---" + (eor2^eor));
    }
//    题：奇数次数数目为2
}
