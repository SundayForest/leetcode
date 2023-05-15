package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 05 --- 22:56
 */
public class maxProduct152 {
//    给你一个整数数组 nums ，请你找出数组中乘积最大的非空连续子数组（该子数组中至少包含一个数字），
//    并返回该子数组所对应的乘积。

    public static int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            int m1 = max;
            max = Math.max(nums[i],Math.max(max * nums[i],min * nums[i]));
            min = Math.min(nums[i],Math.min(m1 * nums[i],min * nums[i]));
            res = Math.max(max,res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-4,-3,-2};
        maxProduct(arr);
        System.out.println(maxProduct(arr));
    }
//        int fs = 0;
//        int max = nums[0];
//        int cur = 1;
//        int low = 0;
//        boolean flag = false;
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] == 0){
//                if(fs == 0){
//                    flag = true;
//                    max = Math.max(max,cur);
//                    cur = 1;
//                    low = i + 1;
//                }else{
//                    int temp = nums[low];
//                    for (int j = low + 1; j < i; j++){
//                        if(nums[j] > 0){
//                            temp *= nums[j];
//                        }else{
//                            max = Math.max(max,temp);
//                            temp = (cur / temp / nums[j]);
//                            max = Math.max(max,temp);
//                            break;
//                        }
//                    }
//                    temp = nums[i - 1];
//                    for (int j = i - 1; j >= low; j--){
//                        if(nums[j] > 0){
//                            temp *= nums[j];
//                        }else{
//                            max = Math.max(max,temp);
//                            temp = (cur / temp / nums[j]);
//                            max = Math.max(max,temp);
//                            break;
//                        }
//                    }
//                    low = i + 1;
//                }
//            }else {
//                if(nums[i] < 0){
//                    fs ^= 1;
//                }
//                cur *= nums[i];
//            }
//        }
//        if(!flag){
//            if(fs == 0){
//                max = Math.max(max,cur);
//                cur = 1;
//                low = 0;
//            }else{
//                int temp = nums[low];
//                for (int j = low; j < nums.length; j++){
//                    if(nums[j] > 0){
//                        temp *= nums[j];
//                    }else{
//                        max = Math.max(max,temp);
//                        temp = (cur / temp / nums[j]);
//                        max = Math.max(max,temp);
//                        break;
//                    }
//                }
//                temp = nums[nums.length - 1];
//                for (int j = nums.length - 1; j >= low; j--){
//                    if(nums[j] > 0){
//                        temp *= nums[j];
//                    }else{
//                        max = Math.max(max,temp);
//                        temp = (cur / temp / nums[j]);
//                        max = Math.max(max,temp);
//                        break;
//                    }
//                }
//            }
//        }
//        return max;
//    }
}

class TestUU{
    public static void main(String[] args) {
       int[] arr = {-2,0,-1};
       maxProduct152 m = new maxProduct152();
        System.out.println(m.maxProduct(arr));
        m.maxProduct(arr);
    }
}
