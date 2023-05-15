package look.基础提升.位运算;

/**
 * @author sunday
 * @create 2023 --- 01 --- 23 --- 10:40
 */
public class AddMinusMulDia {
//    二数相加
//    不断 异或 和相与并进位 1 ，异或为不进位相加结果，另一个是进位信息
//    知道进位信息为0，异或结果为 最后值
    public int add(int a,int b){
        int sum = a;
        while(b != 0){
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;
    }
//    减法
//    第二个数取反加一，得到相反数，再做加法，即为减法
    public int minus(int a,int b){
        return add(a,add(~b,1));
    }
//    乘法
    public int multi(int a,int b){
        int res = 0;
        while(b != 0){
            if((b & 1) != 0){
                res  = add(res,a);
            }
            a <<= 1;
            b >>>= 1; //无符号右移
        }
        return res;
    }
//    除法
    public int div(int a,int b){
        int x = isNeg(a) ? add(~a,1) : a;
        int y = isNeg(b) ? add(~b,1) : b;
        int res = 0;
        for(int i = 31;i > -1; i = minus(i,1)){
            if((x >> i) >= y){
                res |= (1 << i);
                x = minus(x,y<<i);
            }
        }
        return isNeg(a) ^ isNeg(b) ? add(~res,1) : res;
    }
    public boolean isNeg(int n){
        return n < 0;
    }
}
