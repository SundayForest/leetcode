package leetcode;

import java.awt.*;

/**
 * @author sunday
 * @create 2022 --- 10 --- 31 --- 8:24
 */
public class MoveZeros283 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
        public static void moveZeroes(int[] nums) {
        int tail = 0;
            for(int i = 0; i < nums.length - tail;i++){
                if(nums[i] == 0){
                    for(int j = i;j < nums.length - 1 - tail;j++){
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                    i--;
                    tail++;
                }
            }
        }
    }

