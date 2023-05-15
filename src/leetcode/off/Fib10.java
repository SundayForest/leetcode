package leetcode.off;

import java.util.HashMap;

/**
 * @author sunday
 * @create 2023 --- 01 --- 07 --- 12:04
 */
public class Fib10 {
//    写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
//
//F(0) = 0, F(1)= 1
//F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
//斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
//
//答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
    public int fib(int n) {
        HashMap<Integer,Long> hashMap = new HashMap<>();
        hashMap.put(0,0l);
        hashMap.put(1,1l);
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return (int)(help(n,hashMap) % 1000000007);
    }
    public long help(int n,HashMap<Integer,Long> hashMap){
        long n1 = 0;
        long n2 = 0;
        if(hashMap.containsKey(n - 1)){
            n1 = hashMap.get(n - 1);
        }else{
            n1 = help(n - 1,hashMap);
        }
        if(hashMap.containsKey(n - 2)){
            n2 = hashMap.get(n - 2);
        }else{
            n2 = help(n - 2,hashMap);
        }
        if(!hashMap.containsKey(n)){
            hashMap.put(n,(n1 + n2) % 1000000007);
        }
        return  (n1 + n2) % 1000000007;
    }

    public static void main(String[] args) {
//        fib(48);
    }
}
