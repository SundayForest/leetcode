package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2022 --- 11 --- 16 --- 20:08
 */
//给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
//
//注意：不能使用任何内置的 BigInteger 库或直接将输入转换为整数。

public class Multiply43 {
    public static void main(String[] args) {
//        multiply("123456789","987654321");
        System.out.println(multiply("123456789","987654321"));
    }
    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        List<String> list = new ArrayList<>();
        for(int i = num2.length() - 1; i >= 0; i--){
            String temp= "";
            int high = 0;
            int p = num2.charAt(i) - 48;
            for(int j = num1.length() - 1; j >= 0; j--){
                int cur = num1.charAt(j) - 48;
                int now = (cur * p + high ) % 10;
                high = (cur * p + high ) / 10;
                temp = now + temp;
            }
            if(high!=0){
                temp = high + temp;
            }
            for(int j = i; j < num2.length() - 1; j++){
                temp += "0";
            }
            list.add(temp);
        }
        int high = 0;
        int now = 1;
        String res = "";
        while(true){
            boolean b = false;
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).length() - now >= 0){
                    high += (list.get(i).charAt(list.get(i).length() - now) - 48);
                    b = true;
                }
            }
            now++;
            res = (high % 10) + res;
            high /= 10;
            if(!b){
                break;
            }
        }
        if(high != 0){
            res = high + res;
        }
        for(int i = 0; ;){
            if(res.charAt(i) == '0'){
                res = res.substring(1);
            }else{
                break;
            }
        }
        return res;
    }
}
