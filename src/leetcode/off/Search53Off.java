package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 02 --- 10:48
 */
public class Search53Off {
//    统计一个数字在排序数组中出现的次数。
    public static int search(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        int point = low + (high - low) / 2;
        while(low <= high){
            if(high - low < 10){
                int key = 0;
                for(int i = low; i <= high; i++){
                    if(nums[i] == target){
                        key++;
                    }
                }
                return key;
            }
            if(nums[point] == target){
                int key = 1;
                for(int i = point - 1; i >= 0; i--){
                    if(nums[i] == target){
                        key++;
                    }else{
                        break;
                    }
                }
                for(int i = point + 1; i < nums.length; i++){
                    if(nums[i] == target){
                        key++;
                    }else{
                        break;
                    }
                }
                return key;
            }
            if(nums[point] < target){
                low = point;
                point = low + (high - low) / 2;
                if(point == low){
                    return 0;
                }
            }else{
                high = point;
                point = low + (high - low) / 2;
                if(point == high){
                    return 0;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        search(new int[]{1},1);
    }
}
