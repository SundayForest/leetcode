package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 14 --- 21:58
 */
public class MyAtoi8 {
//    请你来实现一个myAtoi(string s)函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
//
//函数myAtoi(string s) 的算法如下：
//
//读入字符串并丢弃无用的前导空格
//检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
//读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
//将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
//如果整数数超过 32 位有符号整数范围 [−231, 231− 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −231 的整数应该被固定为 −231
// ，大于 231− 1 的整数应该被固定为 231− 1 。
//返回整数作为最终结果。
    public static int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0){
            return 0;
        }

        int i = 0;
        boolean b = true;
        if(s.charAt(0) == '+'){
            s = s.substring(1);
        }else if(s.charAt(0)== '-') {
            b = false;
            s = s.substring(1);
        }
        for( ; i < s.length(); i++){
            if(s.charAt(i) > '9' || s.charAt(i) < '0'){
                s = s.substring(0,i);
                break;
            }
        }
        for(int j = 0; j < s.length(); ){
            if(s.charAt(j) == '0'){
                s = s.substring(j + 1);
            }else{
                break;
            }
        }
        if(s.length() == 0){
            return 0;
        }
        if(s.length() > 10){
            return b ? Integer.MAX_VALUE: Integer.MIN_VALUE;
        }
        long res = Long.parseLong(s);
        if(!b){
            res = - res;
        }
        return (int)res == res ? (int)res : (res > 0 ? Integer.MAX_VALUE: Integer.MIN_VALUE);
    }

    public static void main(String[] args) {
        String s = "+-12";
        myAtoi(s);
    }
}
