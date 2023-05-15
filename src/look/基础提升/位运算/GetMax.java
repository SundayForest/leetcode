package look.基础提升.位运算;

/**
 * @author sunday
 * @create 2023 --- 01 --- 23 --- 10:11
 */
public class GetMax {
//    不做任何比较，判断两个数的大小
    public int sign(int n){
//        正数为 1
//        负数为 0
        return flip((n >> 31) & 1);
    }
    public int flip(int n){
        return n ^ 1;
//        1 变 0
//        0 变 1
    }

    public int getMax(int a,int b){
        int c = a - b;
        int sca = sign(c);  //a - b 为非负，sca 为 1；否则为 0
        int scb = flip(sca);
//        sca 为 0 ，scb 就为 1，而且一定相反，大的那个的 sc 一定是 1
        return a * sca + b * scb;
    }
    public int getMax2(int a,int b){
        int c = a - b;
        int sa = sign(a);
        int sb = sign(b);
        int sc = sign(c);
        int disSab = sa ^ sb;//a .b 符号一样，0，不一样，1
        int sameSab = flip(disSab);//a 。b 符号一样，1，不一样，0
        int returnA = disSab * sa + sameSab * sc;
        int returnB = flip(returnA);
        return a * returnA + b * returnB;
    }
}
