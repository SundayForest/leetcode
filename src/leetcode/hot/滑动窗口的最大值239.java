package leetcode.hot;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sunday
 * @create 2023 --- 03 --- 13 --- 19:22
 */
public class 滑动窗口的最大值239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0; i < k; i++){
            while (!deque.isEmpty() && deque.peekLast() < nums[i]){
                deque.pollLast();
            }
            deque.addLast(nums[i]);
        }
        int[] res = new int[nums.length - k + 1];
        for(int i = 0; i < res.length; i++){
            res[i] = deque.peekFirst();
            if(nums[i] == deque.peekFirst()){
                deque.pollFirst();
            }
            while (!deque.isEmpty() && i + k < nums.length &&  deque.peekLast() < nums[i + k]){
                deque.pollLast();
            }
            if( i + k < nums.length){
                deque.addLast(nums[i + k]);
            }
        }
        return res;
    }
}
