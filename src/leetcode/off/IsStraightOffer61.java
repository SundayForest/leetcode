package leetcode.off;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author sunday
 * @create 2022 --- 11 --- 11 --- 19:26
 */
public class IsStraightOffer61 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(isStraight(arr));
    }
    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int flag = -1;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 0){
                count++;
            }else{
                if(flag == -1){
                    flag = nums[i];
                }else{
                    if(nums[i] != flag + 1){
                        if(count == 0 || nums[i] <= flag){
                            return false;
                        }else{
                            count--;
                            flag++;
                            i--;
                        }
                    }else{
                        flag++;
                    }
                }
            }
        }
        return true;
    }
}
