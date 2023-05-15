package leetcode;

import java.util.Stack;

/**
 * @author sunday
 * @create 2022 --- 11 --- 21 --- 20:52
 */
public class EvalRPN150 {
    public static void main(String[] args) {
        String[] s = {"4","13","5","/","+"};
        int i = evalRPN(s);
        System.out.println(i);
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                s.push(s.pop()+s.pop());
            }else if(tokens[i].equals("-")){
                int t = s.pop();
                s.push(s.pop()-t);
            }else if(tokens[i].equals("*")){
                s.push(s.pop()*s.pop());
            }else if(tokens[i].equals("/")){
                int t = s.pop();
                s.push(s.pop()/t);
            }else{
                s.push(Integer.valueOf(tokens[i]));
            }
        }
        return s.pop();
    }
}
