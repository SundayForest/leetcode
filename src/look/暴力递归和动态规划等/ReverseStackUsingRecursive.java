package look.暴力递归和动态规划等;

import java.util.Stack;

/**
 * @author sunday
 * @create 2022 --- 11 --- 12 --- 15:30
 */
// 不用其他数据结构,只使用递归,将一个栈逆序
public class ReverseStackUsingRecursive {

    public static void resverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int i = f(stack);
        resverse(stack);
        stack.push(i);
    }
//    将栈的最后一个数据拿出来，其他不动
    public static int f(Stack<Integer> stack){
        int result = stack.pop();
        if(stack.isEmpty()){
            return result;
        }else{
            int last = f(stack);
            stack.push(last);
            return last;
        }
    }
}
