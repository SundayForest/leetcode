package look;

import java.util.Stack;

/**
 * @author sunday
 * @create 2022 --- 10 --- 30 --- 18:38
 */
//  以o(1)时间复杂度找到栈最小值和插入弹出
public class GetMinStack {
//  维护一个最小栈的值和数据栈
    public static class MyStack1{
        public Stack<Integer> stackData;
        public Stack<Integer> stackMin;

        public MyStack1(){
            this.stackData = new Stack<>();
            this.stackMin = new Stack<>();
        }

        public void push(int newNum){
            if(this.stackMin.isEmpty()){
                this.stackMin.push(newNum);
            }else if(newNum < this.stackMin.peek()){
                this.stackMin.push(newNum);
            }else{
                this.stackMin.push(this.stackMin.peek());
            }
            this.stackData.push(newNum);
        }

        public int pop(){
            if(this.stackMin.isEmpty()){
                throw new RuntimeException("Empty Stack...");
            }
            this.stackMin.pop();
            return this.stackData.pop();
        }

    }
}
