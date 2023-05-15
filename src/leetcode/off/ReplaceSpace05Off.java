package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 01 --- 16:58
 */
public class ReplaceSpace05Off {
//    请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
    public String replaceSpace(String s) {
        s = s.replace(" ","%20");
        return s;
    }
}
