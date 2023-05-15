package look.基础提升.暴力递归改动态规划而且范围尝试下半个矩阵没用;

/**
 * @author sunday
 * @create 2023 --- 01 --- 25 --- 11:08
 */
public class CoinWays {
//    一些面值的纸币任意张，求能拼出 x 元的 方法数
//    这是关于枚举的方法怎么变 动态规划
    int way1(int[] arr,int aim){
        return process(arr,0,aim);
    }
    int process(int[] arr,int index,int aim){
        if(index == arr.length){
            return aim == 0 ? 1 : 0;
        }
        int ways = 0;
        for(int zhang = 0;zhang * arr[index] <= aim; zhang++){
            ways += process(arr,index + 1,aim - zhang * arr[index]);
        }
        return ways;
    }
}
