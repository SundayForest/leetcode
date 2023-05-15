package leetcode.hot;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sunday
 * @create 2023 --- 03 --- 13 --- 22:55
 */
public class 汉明距离461 {
    public int hammingDistance(int x, int y) {
        int k = x ^ y;
        int count = 0;
        for (int i = 0; i < 31; i++){
            count += ((k >> i) & 1) == 1 ? 1 : 0;
        }
        return count;

    }

    public static void main(String[] args) {
        String s1 = new String("a") + new String("b");
        String s2 = "ab";
        System.out.println(s1 == s2); //false
        String s3 = new String("c") + new String("d");
        String s4 = "cd";
        s3.intern();
        System.out.println(s3 == s4);//false
        String s5 = new String("e") + new String("f");
        s5.intern();
        String s6 = "ef";
        System.out.println(s5 == s6);//true
        int i = 1000000000;


    }

}
