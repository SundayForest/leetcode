package leetcode.off;

import java.util.Stack;

/**
 * @author sunday
 * @create 2023 --- 01 --- 27 --- 11:42
 */
public class validateStackSequences31 {
//    输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(popped.length == 0){
            return true;
        }
        Stack<Integer> stack = new Stack<>();
        int push = 0;
        int pop = 0;
        while (true){
            if(push == pushed.length){
                while (!stack.isEmpty()){
                    if(popped[pop++] != stack.pop()){
                        return false;
                    }
                }
                return true;
            }else if(!stack.isEmpty() && popped[pop] == stack.peek()){
                pop++;
                stack.pop();
            }else if(popped[pop] == pushed[push]){
                push++;
                pop++;
            }else{
                stack.push(pushed[push++]);
            }
        }
    }
}
