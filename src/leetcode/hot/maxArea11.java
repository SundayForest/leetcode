package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 02 --- 17 --- 19:59
 */
public class maxArea11 {
//    给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i])。
//
//    找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
//
//    返回容器可以储存的最大水量。
        public int maxArea(int[] height) {
            if(height == null || height.length == 0){
                return 0;
            }
            int low = 0;
            int high = height.length - 1;
            int max = Integer.MIN_VALUE;
            while (low < high){
                if((high - low) * Math.min(height[high],height[low]) > max){
                    max = (high - low) * Math.min(height[high],height[low]);
                }
                if(height[high] < height[low]){
                    high--;
                }else{
                    low++;
                }
            }
            return max;
        }
}
