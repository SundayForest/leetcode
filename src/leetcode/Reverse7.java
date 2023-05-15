package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 13 --- 21:21
 */

//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
//
//如果反转后整数超过 32 位的有符号整数的范围[−2^31, 2^31− 1] ，就返回 0。
public class Reverse7 {
    public static void main(String[] args) {
    }

//    这个方法很呆，解决是否整数溢出的问题可以用强转后比较原数据来解决，leetcode题解里有如下解答
//        public int reverse(int x) {
//        long n = 0;
//        while(x != 0) {
//            n = n*10 + x%10;
//            x = x/10;
//        }
//        return (int)n==n? (int)n:0;
//    }
    public static int reverse(int x) {
        java.math.BigDecimal big=new java.math.BigDecimal(x);
        String s = String.valueOf(big);
        char[] chars = s.toCharArray();
        int head = 0;
        int tail = chars.length-1;
        if(chars[0] == '-'){
            head = 1;
        }
        while(head < tail){
            char temp = chars[head];
            chars[head++] = chars[tail];
            chars[tail--] = temp;
        }

        if(chars[0]=='-' && chars.length == 11){
            java.math.BigDecimal b=new java.math.BigDecimal(String.valueOf(-Math.pow(2,31)));
            String str = String.valueOf(big);
            char[] c = str.toCharArray();
            for(int i = 1; i < chars.length;i++){
                if(chars[i] > c[i]){
                    return 0;
                }else if(chars[i] < c[i]){
                    break;
                }
            }
        }
       if(chars[0]!='-' && chars.length == 10){
           java.math.BigDecimal b=new java.math.BigDecimal(String.valueOf(Math.pow(2,31)-1));
           String str = String.valueOf(b);
           char[] c = str.toCharArray();
           for(int i = 0; i < chars.length;i++){
               if(chars[i] > c[i]){
                   return 0;
               }else if(chars[i] < c[i]){
                   break;
               }
           }
       }
       return Integer.parseInt(new String(chars));
    }
}
