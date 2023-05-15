package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2022 --- 11 --- 20 --- 16:21
 */

//有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
//
//例如："0.1.2.201" 和 "192.168.1.1" 是 有效 IP 地址，但是 "0.011.255.245"、"192.168.1.312" 和 "192.168@1.1" 是
// 无效 IP 地址。
//给定一个只包含数字的字符串 s ，用以表示一个 IP 地址，返回所有可能的有效 IP 地址，这些地址可以通过在 s 中插入'.'
// 来形成。你 不能重新排序或删除 s 中的任何数字。你可以按 任何 顺序返回答案

public class RestoreIpAddresses93 {
    public static void main(String[] args) {
        String s = "25525511135";
        restoreIpAddresses(s);
//        System.out.println();
//        s = s.substring(0,s.length() - 1);
//        System.out.println(s);
//        System.out.println(s.charAt(0));
    }
    public static List<String> restoreIpAddresses(String s) {
        if(s.length() < 4){
            return new ArrayList<>();
        }
        int index = 0;
        List<String> list = new ArrayList<>();
        process(s,list,"",index,index);
        return list;
    }
    public static void process(String s,List<String> list,String str,int index,int p){
        if(index == s.length() && p == 4){
            str = str.substring(0,str.length() - 1);
            list.add(str);
            return;
        }else{
            if(p >= 4 || index >= s.length()){
                return;
            }
        }
        if(s.charAt(index) == '0'){
            process(s,list,str + "0.",index + 1,p + 1);
        }else{
            process(s,list,str + s.charAt(index) + ".",index + 1, p + 1);
            process(s,list,str + s.charAt(index) + s.charAt(index + 1) + ".",index + 2, p + 1);
            if(index + 3 <= s.length()) {
                int i = Integer.valueOf(s.substring(index, index + 3));
                if (i <= 255) {
                    process(s, list, str + i + ".", index + 3, p + 1);
                }
            }
        }
    }
}
