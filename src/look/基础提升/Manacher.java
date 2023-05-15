package look.基础提升;

/**
 * @author sunday
 * @create 2023 --- 01 --- 19 --- 10:26
 */
public class Manacher {
//    求字符串内最长回文字串长度
//    manacher 最主要的是回文半径数组
    public static char[] manacherString(String s){
        char[] chars = s.toCharArray();
        char[] res = new char[s.length() * 2 + 1];
        int index = 0;
        for(int i = 0; i < res.length; i++){
            res[i] = (i & 1) == 0 ? '#' : chars[index++];
        }
        return res;
    }
    public static int maxLcpsLength(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        char[] str = manacherString(s); // 1221 -> 1#2#2#1
        int[] pArr = new int[str.length]; //回文半径数组
        int c = -1; //中心
        int r = -1;// 回文结束 后一个的位置
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < pArr.length ; i++){
            pArr[i] = c > r ? Math.min(pArr[2 * c - i], r - i) : 1;
//            如果边界小于中心，则该点不在上一个中心包裹范围内，最小值为 1
//            否则，取边界与 i 对应点范围最小值
//            求完最小值之后，开始往后面测试是否前后回文
            while (i + pArr[i] < str.length && i - pArr[i] > -1){
                if(str[i + pArr[i]] == str[i - pArr[i]]) {
                    pArr[i]++;
                }else{
                    break;
                }
            }
            if(i + pArr[i] > r){
                r = i + pArr[i];
                c = i;
//                如果产生新边界，跟新边界和中心
            }
            max = Math.max(max,pArr[i]);
        }
        return max - 1;
    }

    public static void main(String[] args) {
        maxLcpsLength("afa");
        System.out.println(maxLcpsLength("afa"));
        System.out.println(maxLcpsLength("cbbd"));
        System.out.println(maxLcpsLength("babad"));
    }
}
