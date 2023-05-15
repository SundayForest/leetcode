package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 25 --- 13:00
 */
public class myPow16 {
//    实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
    public double myPow(double x, int n) {
        if(n == -2147483648 && (x != 1 && x != -1)){
            return 0;
        }
        double res = 1;
        if(n < 0){
            x = 1 / x;
            n = -n;
        }
        if(n <= 4){
            for(int i = 0;i < n; i++){
                res *= x;
            }
            return res;
        }
        res = myPow(x,n/2) ;
        if(n % 2 == 0){
            return res * res;
        }else{
            return res * res * x;
        }
    }
}
