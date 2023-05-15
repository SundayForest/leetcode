package look.暴力递归和动态规划等;

/**
 * @author sunday
 * @create 2022 --- 11 --- 13 --- 19:35
 */
public class CardInLine {
//    有一排纸牌线性排列，玩家 a 与玩家 b 依次拿，双方都绝顶聪明，问最后胜者的 大小
    public static int win1(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }
        return Math.max(f(arr,0,arr.length-1),s(arr,0,arr.length-1));
    }
    public static int f(int[] arr,int i,int j){
        if(i == j){
            return arr[i];
        }
        return Math.max(arr[i] + s(arr,i+1,j),arr[j]+s(arr,i,j-1));
    }


    public static int s(int[] arr,int i,int j){
        if(i == j){
            return 0;
        }
        return Math.min(f(arr,i+1,j),f(arr,i,j-1));
    }
}
