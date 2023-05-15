package leetcode.hot;

import java.util.Stack;

/**
 * @author sunday
 * @create 2023 --- 03 --- 06 --- 21:39
 */
public class SortedStack {
    Stack<Integer> stack;
    Stack<Integer> help;
    public SortedStack() {
        stack = new Stack<>();
        help = new Stack<>();
    }

    public void push(int val) {
        while (!stack.isEmpty() && val > stack.peek()){
            help.push(stack.pop());
        }
        while (!help.isEmpty() && val < help.peek()){
            stack.push(help.pop());
        }
        stack.push(val);

    }

    public void pop() {
        process();
        if(!stack.isEmpty()){
            stack.pop();
        }
    }

    public int peek() {
        process();
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }
    private void process(){
        while (!help.isEmpty()){
            stack.push(help.pop());
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
