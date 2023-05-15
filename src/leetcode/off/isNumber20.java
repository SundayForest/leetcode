package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 27 --- 11:54
 */
public class isNumber20 {
//    请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
    public static boolean isNumber(String s) {
        s = s.trim();
        if(s.length() == 0){
            return false;
        }
        int e = 0;
        int num = 0;
        int point = 1;
        if(s.charAt(0) != '+' && s.charAt(0) != '-' && !(s.charAt(0) <= '9' && s.charAt(0) >= '0') && s.charAt(0) != '.'){
            return false;
        }
        if(s.charAt(0) <= '9' && s.charAt(0) >= '0'){
            num = 1;
        }
        if(s.charAt(0) == '.'){
            point = 0;
        }
        for (int i = 1; i < s.length(); i++){
            if(s.charAt(i) == 'e' || s.charAt(i) == 'E'){
                point = 0;
                if(num == 0 || e == 1){
                    return false;
                }
                num = 0;
                e++;
            }else if(s.charAt(i) == '+' || s.charAt(i) == '-' ){
                if(s.charAt(i - 1) != 'E' && s.charAt(i - 1) != 'e'){
                    return false;
                }
            }else if(s.charAt(i) <= '9' && s.charAt(i) >= '0'){
                num++;
            }else if(s.charAt(i) == '.'){
                if( point == 0){
                    return false;
                }
                point = 0;
            }
            else{
                return false;
            }
        }
        if(num == 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        isNumber(". 1");
        System.out.println(isNumber(". 1"));
    }
}
