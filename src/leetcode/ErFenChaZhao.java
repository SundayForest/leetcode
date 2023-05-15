package leetcode;

/**
 * @author sunday
 * @create 2022 --- 10 --- 29 --- 19:35
 */
public class ErFenChaZhao {
//    给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，
//    写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
//
public static void main(String[] args) {
    int[] arr = {-1,0,3,5,9,12};
    search(arr,9);
}
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        if(nums == null || nums.length == 0){
            return -1;
        }

        while(true){
            int point = (low + high) / 2;
            if(high - low < 5){
                for(int i = low; i <= high; i++){
                    if(nums[i] == target){
                        return i;
                    }
                }
                return -1;
            }
            if(nums[point] == target) {
                return point;
            }else if(nums[point] < target){
                low = point;
            }else if(nums[point] > target){
                high = point;
            }
        }
    }
}
