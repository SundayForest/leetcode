package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 19 --- 22:55
 */

//实现 pow(x, n) ，即计算 x 的整数 n 次幂函数（即，xn ）
public class MyPow50 {
    public static void main(String[] args) {
        double x = 2;
        int n = -2147483648;
        myPow(x,n);
    }
    public static double myPow(double x, int n) {
        if(n == 0 || x == 1){
            return 1;
        }
        if(x == 0 || (x > 1 && n < -1000000)){
            return 0;
        }
        int flag = 1;
        if(n < 0){
            n = -n;
            flag = -1;
        }
        int n1 = n / 2;
        int n2 = n - n1;
        double res = process(x,n1);
        System.out.println(res);
        res = n1 == n2 ? res * res : res * res * x;
        if(flag == 1){
            return res;
        }
        return  1 / res;
    }
    public static double process(double x,int n){
        if(n <= 5){
            double res = 1;
            for(int i = 0; i < n; i++){
                res *= x;
            }
            return res;
        }
        int n1 = n / 2;
        int n2 = n - n1;
        double res = process(x,n1);
        res = n1 == n2 ? res * res : res * res * x;
        return res;
    }
}
