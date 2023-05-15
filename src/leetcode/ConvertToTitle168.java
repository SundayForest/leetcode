package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 16 --- 0:10
 */
public class ConvertToTitle168 {
    public static void main(String[] args) {
        int i = 52;
        System.out.println(convertToTitle(i));
        convertToTitle(i);
    }
    public static String convertToTitle(int columnNumber) {
        String res = "";
        int i = 0;
        while(columnNumber > 26){
            i = columnNumber % 26;
            if(i == 0){
                res = 'Z' + res;
                columnNumber--;
            }else {
                res = (char) ('A' + i - 1) + res;
            }
            columnNumber /= 26;
        }
        if(columnNumber > 0){
            res = (char)('A' + columnNumber - 1) + res;
        }
        return  res;
    }
}
