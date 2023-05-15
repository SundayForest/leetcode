package leetcode.off;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sunday
 * @create 2023 --- 01 --- 28 --- 10:27
 */
public class MaxQueue59 {
//    请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front
//    的均摊时间复杂度都是O(1)。
//若队列为空，pop_front 和 max_value需要返回 -1

    Deque<Integer> integerDeque;
    Queue<Integer> queue;
    public MaxQueue59() {
        integerDeque = new ArrayDeque<>();
        queue = new LinkedList<>();
    }

    public int max_value() {
        if(integerDeque.isEmpty()){
            return -1;
        }
        return integerDeque.peekFirst();
    }

    public void push_back(int value) {
        while (!integerDeque.isEmpty()){
            if(integerDeque.peekLast() <= value){
                integerDeque.pollLast();
            }else{
                break;
            }
        }
        integerDeque.addLast(value);
        queue.add(value);
    }

    public int pop_front() {
        if(integerDeque.isEmpty() || queue.isEmpty()){
            return -1;
        }
        int ans = queue.poll();
        if(ans == integerDeque.peekFirst()){
            integerDeque.pollFirst();
        }
        return ans;
//        if(queue.peek() < integerDeque.peekFirst()){
//            return queue.poll();
//        }
//        queue.poll();
//        return integerDeque.pollFirst();
    }
}
