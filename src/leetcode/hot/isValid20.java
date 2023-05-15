package leetcode.hot;

import java.util.Stack;

/**
 * @author sunday
 * @create 2023 --- 02 --- 17 --- 20:56
 */
public class isValid20 {
//    给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
//有效字符串需满足：
//
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。
//每个右括号都有一个对应的相同类型的左括号
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else{
                if(!stack.isEmpty()){
                    return false;
                }else{
                    char c = stack.pop();
                    if(c == '['){
                        if(s.charAt(i) != ']'){
                            return false;
                        }
                    }
                    if(c == '{'){
                        if(s.charAt(i) != '}'){
                            return false;
                        }
                    }
                    if(c == '('){
                        if(s.charAt(i) != ')'){
                            return false;
                        }
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        isValid("()");
    }
}
