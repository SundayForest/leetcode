package look.基础提升.暴力递归改动态规划而且范围尝试下半个矩阵没用;

/**
 * @author sunday
 * @create 2023 --- 01 --- 25 --- 10:20
 */
public class MaxNum {
//    一列数字，俩人依次拿左右俩边任意一个数字，返回最终获胜者分数
    int win1(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }
        return Math.max(f(arr,0,arr.length - 1),s(arr,0,arr.length - 1));
    }
    int f(int[] arr,int i,int j){
        if(i == j){
            return arr[i];
        }
        return Math.max(arr[i] + s(arr,i + 1,j),arr[j] + s(arr,i ,j - 1));
//        自己跳好的，所以 max
    }
    int s(int[] arr,int i,int j){
        if(i == j){
            return 0;
        }
        return Math.min(f(arr,i + 1,j),f(arr,i ,j - 1));
//        对手把好的拿走了，自己能拿的一定小，所以 min
    }
}
