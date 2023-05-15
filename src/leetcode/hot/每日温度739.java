package leetcode.hot;

import java.util.Stack;

/**
 * @author sunday
 * @create 2023 --- 03 --- 13 --- 22:34
 */
public class 每日温度739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int point = stack.pop();
                res[point] = i - point;
            }
            stack.push(i);
        }
        return res;
    }
}
