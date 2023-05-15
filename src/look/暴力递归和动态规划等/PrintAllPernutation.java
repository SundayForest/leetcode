package look.暴力递归和动态规划等;

import java.util.ArrayList;

/**
 * @author sunday
 * @create 2022 --- 11 --- 13 --- 18:54
 */
public class PrintAllPernutation {
//    打印字符串不重复全排列
//    通过在每一层设立hashset来提前截断重复的路来加速
    public static void process(char[] str, int i, ArrayList<String> res){
        if(i == str.length){
            res.add(String.valueOf(str));
        }
        boolean[] visit = new boolean[26];
        for(int j = i; j < str.length; j++){
            if(!visit[str[j]-'a']){
                visit[str[j]-'a'] = true;
                swap(str,i,j);
                process(str,i + 1,res);
                swap(str,i,j);
//                重复一次交换是为了复原字符串，否则递归回去的时候字符串就变了
            }
        }
    }

    public static void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
