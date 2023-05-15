package leetcode;

import java.util.List;

/**
 * @author sunday
 * @create 2022 --- 10 --- 30 --- 20:27
 */
public class Rotate189 {
    public static void main(String[] args) {
        int[] arr = {1,2};
//        System.out.println(arr.length);
        rotate(arr,2);
    }
    public static void rotate(int[] nums, int k) {
        if(nums.length < 2  || k == 0 || k % nums.length == 0){

        }else {
            int head = 0;
            int tail = nums.length - 1;
            int temp;
            while (head < tail) {
                temp = nums[head];
                nums[head] = nums[tail];
                nums[tail] = temp;
                head++;
                tail--;
            }
            tail = (k - 1) % nums.length;
            head = 0;
            while (head < tail) {
                temp = nums[head];
                nums[head] = nums[tail];
                nums[tail] = temp;
                head++;
                tail--;
            }
            tail = nums.length - 1;
            head = k % nums.length;
            while (head < tail) {
                temp = nums[head];
                nums[head] = nums[tail];
                nums[tail] = temp;
                head++;
                tail--;
            }


        }





//        时间太长，如果不一步一步走的话，当轮转量为数组长度一半时，将无法轮转，会在2个数字直接来回轮换
    }
}
