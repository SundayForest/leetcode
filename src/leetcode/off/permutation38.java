package leetcode.off;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 01 --- 29 --- 10:22
 */
public class permutation38 {
//    输入一个字符串，打印出该字符串中字符的所有排列。
//你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
    char[] c;
    List<String> list;
    public String[] permutation(String s) {
        c = s.toCharArray();
        list = new ArrayList<>();
        dfs(0);
        return list.toArray(new String[list.size()]);
    }
    public void dfs(int x){
        if(x == c.length){
            list.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for(int i = x; i < c.length; i++){
            if(!set.contains(c[i])){
                set.add(c[i]);
                swap(i,x);
                dfs(x + 1);
                swap(i,x);
            }
        }
    }
    public void swap(int a,int b){
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
}
