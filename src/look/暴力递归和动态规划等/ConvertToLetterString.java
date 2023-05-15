package look.暴力递归和动态规划等;

/**
 * @author sunday
 * @create 2022 --- 11 --- 13 --- 19:07
 */
public class ConvertToLetterString {
//    给一个数字字符串，1为a，2为b，11为k，以此类推
//    求转化的所有可能性个数
//    暴力递归版
    public static int process(char[] str,int i){
        if(i == str.length){
            return 1;
        }
        if(str[i] == '0'){
            return 0;
//            此路不通
        }
        if(str[i] == '1'){
            int res = process(str,i+1);
            if(i + 1 < str.length){
                res += process(str, i + 2);
            }
            return res;
        }
        if(str[i] == '2'){
            int res = process(str, i + 1);
            if(i + 1 < str.length && str[i+1] >= '0' && str[i+1] <= '6'){
                res += process(str, i + 2);
            }
            return res;
        }
//        3 ~ 9
        return process(str,i+1);
    }
}
