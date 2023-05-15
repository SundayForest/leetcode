package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 24 --- 19:21
 */
public class OneAddToN {
//    求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
    public int sumNums(int n) {
        boolean b = (n > 1 && (n += sumNums(n - 1)) > 1);
        return n;
    }
}
