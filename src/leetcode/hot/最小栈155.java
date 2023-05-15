package leetcode.hot;

import java.util.Stack;

/**
 * @author sunday
 * @create 2023 --- 03 --- 12 --- 11:25
 */
public class 最小栈155 {
    class MinStack2 {
        Stack<Integer> stack;
        Stack<Integer> help;
        Stack<Integer> all;
        public MinStack2() {
            stack = new Stack<>();
            help = new Stack<>();
            all = new Stack<>();
        }

        public void push(int val) {
            while (!stack.isEmpty() && val > stack.peek()){
                help.push(stack.pop());
            }
            while (!help.isEmpty() && val < help.peek()){
                stack.push(help.pop());
            }
            stack.push(val);
            all.push(val);
        }

        public void pop() {
            int val = all.pop();
            while (!stack.isEmpty() && val > stack.peek()){
                help.push(stack.pop());
            }
            if(!stack.isEmpty() && val == stack.peek()){
                stack.pop();
            }
            while (!help.isEmpty() && val < help.peek()){
                stack.push(help.pop());
            }
            if(!help.isEmpty() && val == help.peek()){
                help.pop();
            }
        }

        public int top() {
            return all.peek();
        }

        public int getMin() {
            while (!help.isEmpty()){
                stack.push(help.pop());
            }
            return stack.peek();
        }
    }
    class MinStack{
        Stack<Integer> real;
        Stack<Integer> min;
        public MinStack() {
            real = new Stack<>();
            min = new Stack<>();
        }
        public int getMin() {
            return min.peek();
        }
        public int top() {
            return real.peek();
        }
        public void pop() {
            min.pop();
            real.pop();
        }
        public void push(int val) {
            real.push(val);
            if (min.isEmpty() || min.peek() > val){
                min.push(val);
            }else{
                min.push(min.peek());
            }
        }
    }
}
