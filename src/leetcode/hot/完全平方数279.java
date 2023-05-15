package leetcode.hot;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author sunday
 * @create 2023 --- 03 --- 13 --- 19:40
 */
public class 完全平方数279 {
    public static int numSquares(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, f[i - j * j]);
            }
            f[i] = minn + 1;
//            AtomicStampedReference<Integer>
        }
        return f[n];
    }

    public static void main(String[] args) {
//        numSquares(6110);
        System.out.println(numSquares(6110));
        Executors.newCachedThreadPool();
//        new Executor();
    }
}
