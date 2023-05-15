package leetcode.off;

import javax.swing.*;

/**
 * @author sunday
 * @create 2023 --- 01 --- 27 --- 12:24
 */
public class strToInt67 {
//    写一个函数 StrToInt，实现把字符串转换成整数这个功能
    public static int strToInt(String str) {
        int index = 0;
        int c = 1;
        for( ; index < str.length(); index++){
            char temp = str.charAt(index);
            if(temp == '+'){
                index++;
                break;
            }
            if(temp == '-'){
                c = -1;
                index++;
                break;
            }
            if(temp <= '9' && temp >= '0'){
                break;
            }
            if(temp != ' '){
                return 0;
            }
        }
        String s = "";
        while (index < str.length()){
            if(str.charAt(index) <= '9' && str.charAt(index) >= '0'){
                s += str.charAt(index);
            }else{
                break;
            }
            index++;
        }
        if(s.length() == 0){
            return 0;
        }
        long l = 0;
        for(int i = 0; i < s.length(); i++){
            l += (s.charAt(s.length() - 1 - i) - 48) * Math.pow(10,i);
        }
        if(c == 1){
            if(l > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else{
                return (int)l;
            }
        }
        if(l * -1 < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return -(int)l;
    }

    public static void main(String[] args) {
        strToInt("64");
        System.out.println(strToInt("64"));
    }
}
