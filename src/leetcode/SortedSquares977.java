package leetcode;

/**
 * @author sunday
 * @create 2022 --- 10 --- 30 --- 20:04
 */
public class SortedSquares977 {
    public static void main(String[] args) {
        int[] arr = {-1,2,2};
        sortedSquares(arr);
    }
    public static int[] sortedSquares(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        int[] arr = new int[nums.length];
        int point = nums.length - 1;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                point = i;
                break;
            }
        }
        int now = 0;
        int left = point - 1;
        int right = point;
        while(true){
            if(now == nums.length){
                break;
            }
            if(left < 0){
                arr[now] = nums[right] * nums[right];
                right++;
                now++;
            }else if(right == nums.length){
                arr[now] = nums[left] * nums[left];
                left--;
                now++;
            } else {
                if (nums[left] * nums[left] > nums[right] * nums[right]) {
                    arr[now] = nums[right] * nums[right];
                    right++;
                    now++;
                } else {
                    arr[now] = nums[left] * nums[left];
                    left--;
                    now++;
                }
            }
        }
        return arr;
    }
}
