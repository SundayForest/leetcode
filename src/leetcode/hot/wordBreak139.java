package leetcode.hot;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 03 --- 05 --- 20:08
 */
public class wordBreak139 {
    static int pre = Integer.MIN_VALUE;
    public static boolean isValidBST(TreeNode root) {
        return process(root);
    }
    public static boolean process(TreeNode node){
        if(node == null){
            return true;
        }
        boolean b =  process(node.left);
        if(!b){
            return false;
        }
        if(pre >= node.val){
            return false;
        }else{
            pre = node.val;
        }
        b = process(node.right);
        return b;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(Integer.MIN_VALUE);
        System.out.println(isValidBST(node));
    }
//    给你一个字符串 s 和一个字符串列表 wordDict 作为字典。
//    请你判断是否可以利用字典中出现的单词拼接出 s 。
//    public boolean wordBreak(String s, List<String> wordDict) {
//
//    }
//    public boolean process
//    public boolean process(String s, List<String> wordDict,String temp){
//        if(s.equals(temp)){
//            return true;
//        }
//        int point = temp.length();
//        for(int i = 0; i < wordDict.size(); i++){
//            boolean flag = true;
//            for(int j = 0; j < wordDict.get(i).length(); j++){
//                if(point + j == s.length() || s.charAt(point + j) != wordDict.get(i).charAt(j)){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                boolean b = process(s,wordDict,temp + wordDict.get(i));
//                if(b){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}

//class Test{
//    public static void main(String[] args) {
//        wordBreak139 wordBreak = new wordBreak139();
//        List<String> list = new ArrayList<>();
//        list.add("leet");
//        list.add("code");
//        wordBreak.wordBreak("leetcode",list);
//    }
//}
