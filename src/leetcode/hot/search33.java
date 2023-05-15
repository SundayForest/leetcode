package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 02 --- 21 --- 18:58
 */
public class search33 {
//    整数数组 nums 按升序排列，数组中的值 互不相同 。
//
//在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k],
// nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。
// 例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
//
//给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
//
//你必须设计一个时间复杂度为 O(log n) 的算法解决此问题。
    public static int search(int[] nums, int target) {
        int point = nums[nums.length - 1];
        int low = 0;
        int high = nums.length - 1;
        int mid = low + (high - low) / 2;
        int size = 0;
        while (true){
            if(high - low < 10){
                for (int i = low; i < high; i++){
                    if (nums[i] > nums[i + 1]){
                        size = i + 1;
                        break;
                    }
                }
                break;
            }
            if(nums[mid] > nums[mid] + 1){
                size = mid + 1;
                break;
            }else{
                if(nums[mid] < point){
                    high = mid;
                }else{
                    low = mid;
                }
                mid = low + (high - low) / 2;
            }
        }
        low = 0;
        high = nums.length - 1;
        mid = low + (high - low) / 2;
        while (true){
            if(high - low < 10){
                for (int i = low; i <= high; i++){
                    if(nums[(i + size) % nums.length] == target) {
                        return (i + size) % nums.length;
                    }
                }
                return -1;
            }
            if(nums[(mid + size)%nums.length] == target){
                return (mid + size)%nums.length;
            }
            if(nums[(mid + size)%nums.length] < target){
                low = mid;
            }else{
                high = mid;
            }
            mid = low + (high - low) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{57,58,59,62,63,66,68,72,73,74,75,76,77,78,80,81,86,95,96,97,98,100,101,102,103,110,119,120,121,123,125,126,127,132,136,144,145,148,149,151,152,160,161,163,166,168,169,170,173,174,175,178,182,188,189,192,193,196,198,199,200,201,202,212,218,219,220,224,225,229,231,232,234,237,238,242,248,249,250,252,253,254,255,257,260,266,268,270,273,276,280,281,283,288,290,291,292,294,295,298,299,4,10,13,15,16,17,18,20,22,25,26,27,30,31,34,38,39,40,47,53,54};
        search(arr,30);
        System.out.println(search(arr,30));
    }
}
