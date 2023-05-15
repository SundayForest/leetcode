package leetcode.off;

/**
 * @author sunday
 * @create 2022 --- 12 --- 30 --- 19:17
 */
public class MinStack30Off {
    class MyStack{
        int value;
        int min;
        MyStack next;
    }
    MyStack head;
    public MinStack30Off() {
        head = new MyStack();
        head.min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        MyStack point = head;
        while (point.next != null){
            point = point.next;
        }
        MyStack newStack = new MyStack();
        newStack.value = x;
        newStack.min = x > point.min ? point.min : x;
        point.next = newStack;
    }

    public void pop() {
        MyStack point = head;
        while (point.next != null){
            if(point.next.next == null){
                point.next = null;
                return;
            }
            point = point.next;
        }
    }

    public int top() {
        MyStack point = head;
        while (point.next != null){
            point = point.next;
        }
        return point.value;
    }

    public int min() {
        MyStack point = head;
        while (point.next != null){
            point = point.next;
        }
        return point.min;
    }

    public static void main(String[] args) {
        MinStack30Off minStack30Off = new MinStack30Off();
        minStack30Off.push(-2);
        minStack30Off.push(0);
        minStack30Off.push(-3);
        System.out.println(minStack30Off.min());
        minStack30Off.pop();
        System.out.println(minStack30Off.top());
        System.out.println(minStack30Off.min());

    }

}
