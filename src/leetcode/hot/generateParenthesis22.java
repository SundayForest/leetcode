package leetcode.hot;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author sunday
 * @create 2023 --- 02 --- 17 --- 21:41
 */
public class generateParenthesis22 {
//    数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        process(0,"",res,0,n * 2);
        return res;
    }
    public static void process(int index, String str , List<String> res, int pre,int n){
        if(n < index){
            return;
        }
        if(n == index){
            if(pre == 0){
                res.add(str);
            }
        }else if(pre != 0){
            process(index + 1,str + ")",res,pre - 1,n);
        }
        process(index + 1,str + "(",res,pre + 1,n);
    }

    public static void main(String[] args) {
        generateParenthesis(2);
    }
}
