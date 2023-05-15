package leetcode.hot;

import look.基础提升.滑动窗口.WindowMax;

/**
 * @author sunday
 * @create 2023 --- 02 --- 22 --- 14:28
 */
public class sortColors75 {
//    给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，
//    并按照红色、白色、蓝色顺序排列。
//
//我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
//
//必须在不使用库内置的 sort 函数的情况下解决这个问题

    public static void sortColors(int[] nums) {
        int zero = 0;
        int two = nums.length;
        for (int i = 0; i < two; ){
            if(nums[i] == 0){
                swap(i++,zero++,nums);
            }else if(nums[i] == 2){
                swap(i,--two,nums);
            }else{
                i++;
            }

        }
    }
    public static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

    }
}
