package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 11 --- 21:28
 */
public class 修改数字 {
    public static int process(String str){
        if(str == null || str.length() < 2){
            return 0;
        }
        int res = 0;
        int count = 1;
        char pre = str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i - 1)){
                count++;
            }else{
                res += count >> 1;
                count = 1;
            }
        }
        res += count >> 1;
        return res;
    }

    public static void main(String[] args) {
        String s = "111122223333";
        System.out.println(process(s));
    }
}
