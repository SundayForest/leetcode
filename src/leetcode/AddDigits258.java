package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 21 --- 3:29
 */
public class AddDigits258 {
    public int addDigits(int num) {
        int n = 10;
        while(n >= 10){
            n = 0;
            while(num != 0) {
                n += num % 10;
                num /= 10;
            }
            num = n;
        }
        return n;
    }
}
