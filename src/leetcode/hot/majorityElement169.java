package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 06 --- 10:45
 */
public class majorityElement169 {
    public int majorityElement(int[] nums) {
        int i = 0;
        int j = 1;
        int high = nums.length - 1;
        for ( ; j <= high; ){
            if(nums[i] != nums[j]){
                swap(j,high--,nums);
                swap(i,high--,nums);
                j = 1;
            }
            else{
                j++;
            }
        }
        return nums[i];
    }
    public void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
class maTest{
    public static void main(String[] args) {
        majorityElement169 m = new majorityElement169();
        int[] arr = new int[]{3,3,4};
        m.majorityElement(arr);
        System.out.println(m.majorityElement(arr));
    }
}
