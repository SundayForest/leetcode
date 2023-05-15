package leetcode.off;

import java.util.Stack;

/**
 * @author sunday
 * @create 2022 --- 12 --- 30 --- 19:02
 */
public class CQueue09Off {
    Stack<Integer> values;
    public CQueue09Off () {
        values = new Stack<>();
    }

    public void appendTail(int value) {
        values.add(value);
    }

    public int deleteHead() {
        Stack<Integer> d = new Stack<>();
        for(;values.size() > 0;){
            d.add(values.pop());
        }
        if(d.size() == 0){
            return -1;
        }
        int res = d.pop();
        for(;d.size() > 0;){
            values.add(d.pop());
        }
        return res;
    }

    public static void main(String[] args) {
        CQueue09Off cQueue09Off = new CQueue09Off();
        cQueue09Off.appendTail(2);
        cQueue09Off.appendTail(5);
        System.out.println(cQueue09Off.deleteHead());
        System.out.println(cQueue09Off.deleteHead());
//        cQueue09Off.deleteHead();
//        cQueue09Off.deleteHead();
    }
}

