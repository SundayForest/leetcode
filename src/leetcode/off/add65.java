package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 25 --- 13:28
 */
public class add65 {
//    写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
    public int add(int a, int b) {
        int sum = a;
        while(b != 0){
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;
    }
}
