package leetcode.off;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 01 --- 20 --- 11:57
 */
public class Reverse58 {
//    输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
//    为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，
//    则输出"student. a am I"。
    public static String he(String s){
            if(s == null || s.length() == 0){
                return s;
            }
            String[] strings = s.split(" ");
            String res= "";
            for(int i = strings.length - 1; i >= 0 ; i--){
                if(!strings[i].equals("")){
                    res += strings[i];
                    res += " ";
                }
            }
            if(res.length() > 0) {
                res = res.substring(0, res.length() - 1);
            }
            return res;
    }

    public static void main(String[] args) {
        String s = "  hello world!  ";
        he(s);
        System.out.println("'" + he(s) + "'");
//        String s = "     1  ";
//        String[] strings = s.split(" ");
//        for(int i = 0; i < strings.length; i++){
//            System.out.println(strings[i]);
//        }
    }

}
