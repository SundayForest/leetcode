package leetcode;

/**
 * @author sunday
 * @create 2023 --- 02 --- 20 --- 19:06
 */
public class firstMissingPositive41 {
//    给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
//
//请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
    public static int firstMissingPositive(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high){
            if(nums[low] == low + 1){
                low++;
            }else if(nums[low] < high + 2 && nums[low] > low && (nums[nums[low] - 1] != nums[low])){
                swap(low,nums[low] - 1,nums);
            }else{
                swap(low,high--,nums);
            }
        }
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }
        return nums.length + 1;
    }
    public static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] ar = {1,2,6,3,5,4};
        firstMissingPositive(ar);
        System.out.println( firstMissingPositive(ar));
    }
}
