package look.暴力递归和动态规划等;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2022 --- 11 --- 13 --- 18:37
 */
public class PrintAllSubsquences {
//    打印所有子序列
    public static List<String> subs(String s){
        char[] str = s.toCharArray();
        String path = "";
        List<String> ans = new ArrayList<>();
        process1(str,0,ans,path);
        return ans;
    }
//    每一个位置选或不选，做递归
    public static void process1(char[] str,int index,List<String> ans,String path){
        if(index == str.length){
            ans.add(path);
            return;
        }
        String no = path;
        process1(str,index + 1,ans,no);
        String yes = "path" + String.valueOf(str[index]);
        process1(str,index + 1,ans,yes);
    }
}
