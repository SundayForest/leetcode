package leetcode.off;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sunday
 * @create 2023 --- 01 --- 28 --- 10:00
 */
public class maxSlidingWindow59 {
//    给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> queue = new LinkedList<>();
        queue.add(0);
        for(int i = 1; i < k; i++){
            while (!queue.isEmpty()){
                if(nums[queue.getLast()] <= nums[i]){
                    queue.pollLast();
                }else{
                    break;
                }
            }
            queue.addLast(i);
        }
        res[0] = nums[queue.getFirst()];
        for(int i = k; i < nums.length; i++){
            if(queue.getFirst() == i - k){
                queue.pollFirst();
            }
            while (!queue.isEmpty()){
                if(nums[queue.getLast()] <= nums[i]){
                    queue.pollLast();
                }else {
                    break;
                }
            }
            queue.addLast(i);
            res[i - k + 1] = nums[queue.peekFirst()];
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,3,-1,-3,5,3,6,7};
        maxSlidingWindow(arr,3);
    }
}
