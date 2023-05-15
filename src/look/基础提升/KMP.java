package look.基础提升;

/**
 * @author sunday
 * @create 2023 --- 01 --- 18 --- 11:48
 */
public class KMP {
//    KMP 求 一个字符串 是否是 另一个字符串 的 子字符串
    public int kmp(String s,String m){
        if(s == null || m == null || m.length() < 1 || s.length() < m.length()){
            return -1;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = m.toCharArray();
        int i1 = 0;
        int i2 = 0;
        int[] next = getNextArray(str2);
        while(i1 < str1.length && i2 < str2.length){
            if(str1[i1] == str2[i2]){
                i1++;
                i2++;
            }else if(i2 == 0){
//                无法再往前跳
                i1++;
            }else{
//                i1不动，i2往前跳
                i2 = next[i2];
            }
        }
//        i1 或者 i2 越界
        return i2 == str2.length ? i1 - i2 : -1;
    }

    private int[] getNextArray(char[] str2) {
        if(str2.length == 1){
            return new int[]{-1};
        }
        int[] next = new int[str2.length];
        next[0] = -1;
        next[1] = 0;
        int i = 2;
        int cn = 0;
        while(i < next.length){
            if(str2[i - 1] == str2[cn]){
//                cn 的位置值和 后面所用的数组里的值一样
//                如果相等，该位置的值为cn的值+1 ，然后往后一格，
                next[i++] = ++cn;
            }else if(cn > 0){
//                如果不等， cn 往前跳
                cn = next[cn];
            }else{
                next[i++] = 0;
            }
        }
        return next;
    }
}
