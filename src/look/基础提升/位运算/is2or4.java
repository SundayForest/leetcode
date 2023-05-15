package look.基础提升.位运算;

/**
 * @author sunday
 * @create 2023 --- 01 --- 23 --- 10:30
 */
public class is2or4 {
//    判断一个数是否是 2 的幂或者 4 的幂
    boolean is2(int n){
         if((n & (n - 1)) == 0){
             return true;
         }
         return false;
    }
    boolean is4(int n){                   //01010101..0101
        return (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
}
