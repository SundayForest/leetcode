package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 02 --- 21 --- 21:17
 */
public class maxSubArray53 {
//    给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
//子数组 是数组中的一个连续部分。
    public static int maxSubArray(int[] nums) {
//        if(nums.length == 1){
//            return nums[0];
//        }
//        int sum = 0;
//        for(int i = 0; i < nums.length; i++){
//            sum += nums[i];
//        }
//        int max = sum;
//        int left = 0;
//        int right = nums.length - 1;
//        while (left != right){
//            if(nums[left] < nums[right]){
//                sum -= nums[left++];
//                max = Math.max(max,sum);
//            }else {
//                sum -= nums[right--];
//                max = Math.max(max,sum);
//            }
//        }
//        return max;
        //----------------------------------------
//        if(nums.length == 1){
//            return nums[0];
//        }
//        int m = nums[0];
//        int[] help = new int[nums.length];
//        help[0] = nums[0];
//        int[] aft = new int[nums.length];
//        int max = Integer.MIN_VALUE;
//        int[] pre = new int[nums.length];
//        int min = Integer.MAX_VALUE;
//        boolean f = false;
//        for (int i = 1; i < help.length; i++) {
//            help[i] = help[i - 1] + nums[i];
//            m = Math.max(m,nums[i]);
//            if(help[i] >= 0){
//                f = true;
//            }
//        }
//        if(!f){
//            return m;
//        }
//        for(int i = 0; i < help.length; i++){
//            min = Math.min(min,help[i]);
//            pre[i] = min;
//            max = Math.max(max,help[help.length - i - 1]);
//            aft[help.length - i - 1] = max;
//        }
//        int res = Integer.MIN_VALUE;
//        for(int i = 0; i < help.length; i++){
//            res = Math.max(res,aft[i] - pre[i]);
//        }
//        return Math.max(res,help[help.length - 1]);
        //-------------------------
        if(nums.length == 1){
            return nums[0];
        }
        int m = nums[0];
        int[] help = new int[nums.length + 1];
        help[0] = 0;
        int[] aft = new int[nums.length + 1];
        int max = Integer.MIN_VALUE;
        int[] pre = new int[nums.length + 1];
        int min = Integer.MAX_VALUE;
        boolean f = false;
        for (int i = 1; i < help.length; i++) {
            help[i] = help[i - 1] + nums[i - 1];
            m = Math.max(m,nums[i - 1]);
            if(nums[i - 1] >= 0){
                f = true;
            }
        }
        if(!f){
            return m;
        }
        aft[aft.length - 1] = help[help.length - 1];
        for(int i = 1; i < help.length; i++){
            min = Math.min(min,help[i]);
            pre[i] = min;
//            max = Math.max(max,help[help.length - i - 1] - help[help.length - i]);
            max = Math.max(max,help[help.length - i]);
//            aft[help.length - i - 1] = Math.max(max,help[help.length - i])
            aft[help.length - i - 1] = max;
        }
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < help.length; i++){
            res = Math.max(res,aft[i] - pre[i]);
        }
        return Math.max(res,help[help.length - 1]);
    }

    public static void main(String[] args) {
        int [] arr = {-1,-2,-2,-2,3,2,-2,0};
        maxSubArray(arr);
        System.out.println(maxSubArray(arr));
    }
}
