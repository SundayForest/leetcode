package look.暴力递归和动态规划等;

/**
 * @author sunday
 * @create 2022 --- 11 --- 15 --- 19:50
 */
// N 皇后问题
public class NQueen {
    public static int method1(int n){
        if(n < 1){
            return 0;
        }
        int[] record = new int[n];
        return process1(0,record,n);
    }
// i 当前行
//    record 之前的摆法
//    总共几行
    public static int process1(int i, int[] record, int n){
        if(i == n){
            return 1;
        }
        int res = 0;
        for(int j = 0; j < record.length; j++){
            if(isValid(record,i,j)){
                record[i] = j;
                res += process1(i + 1,record,n);
            }
        }
        return res;
    }
//  判断是否能摆放
    public static boolean isValid(int[] record,int i,int j){
        for(int k =0; k < i;k++){
            if(j == record[k] || Math.abs(record[k] - j) == Math.abs(i - k)){
                return false;
            }
//            判断共斜线：x。y坐标差的绝对值相等即为共斜线
        }
        return true;
    }
}
