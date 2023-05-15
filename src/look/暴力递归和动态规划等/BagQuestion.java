package look.暴力递归和动态规划等;

/**
 * @author sunday
 * @create 2022 --- 11 --- 13 --- 19:19
 */
public class BagQuestion {
//    背包问题
    public static int process1(int[] w,int[] v,int index, int alreadyW,int bag){
        if(alreadyW > bag){
            return -1;
//            超出了背包范围，失败
        }
        if(index == w.length){
            return 0;
//            成功的方案
        }
        int p1 = process1(w,v,index+1,alreadyW,bag);
//        没要index的货
        int p2next = process1(w,v,index+1,alreadyW+w[index],bag);
//        要了index的货
        int p2 = -1;
        if(p2next != -1){
            p2 = v[index] + p2next;
        }
        return Math.max(p1,p2);
    }
}
