package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 20 --- 11:43
 */
public class Exchange21 {
//    输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分
public int[] exchange(int[] nums) {
    if(nums == null || nums.length <= 1){
        return nums;
    }
    int low = 0;
    int high = nums.length - 1;
    while(low < high){
        if(nums[low] % 2 == 0){
            change(low,high--,nums);
        }else{
            low++;
        }
    }
    return nums;
}
public void change(int i,int j,int[] arr){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
}
