package look.基础提升.暴力递归改动态规划而且范围尝试下半个矩阵没用;

/**
 * @author sunday
 * @create 2023 --- 01 --- 24 --- 18:44
 */
public class CoinToNum {
//    一个硬币数组，组成所需钱最少要多少个
//    动态规划，缓存法，用一个数组记录下用到的值，如果没有就写进去，有就直接用
    int minCoin1(int[] arr,int aim){
        return process(arr,0,aim);
    }
    int process(int[] arr,int index,int aim){
        if(aim < 0){
            return -1;
        }
        if(aim == 0){
            return 0;
        }
        if (index == arr.length){
            return -1;
        }
        int p1 = process(arr,index + 1,aim);
        int p2 = 1 +  process(arr,index +1,aim - arr[index]);
        if(p1 == -1 && p2 == -1){
            return -1;
        }else{
            if(p1 == -1){
                return p2;
            }
            if(p2 == -1){
                return p1;
            }
            return Math.min(p1,p2);
        }
    }
}
