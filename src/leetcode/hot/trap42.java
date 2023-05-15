package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 02 --- 21 --- 20:14
 */
public class trap42 {
//    给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
    public static int trap(int[] height) {
        int sum = 0;
        int left = 0;
        int right = 0;
        int lmax = 0;
        int rmax = 0;
        int temp = sum - 1;
        while (temp != sum) {
            temp = sum;
            for (int i = 1; i < height.length; ) {
                if (height[i] < height[i - 1]) {
                    left = i - 1;
                    lmax = height[i - 1];
                    int j = i;
                    for (; j < height.length; ) {
                        if (height[j] > height[j - 1]) {
                            break;
                        } else {
                            j++;
                        }
                    }
                    for (; j < height.length; ) {
                        if (height[j] < height[j - 1]) {
                            rmax = height[j - 1];
                            right = j - 1;
                            break;
                        } else {
                            j++;
                        }
                    }
                    if(j == height.length && height[j- 1] > height[j - 2]){
                        rmax = height[j - 1];
                        right = j - 1;
                    }
                    int max = Math.min(lmax, rmax);
                    for (int k = left; k <= right; k++) {
                        if (max - height[k] > 0) {
                            sum += (max - height[k]);
                            height[k] = max;
                        }
                    }
                    if (j == height.length) {
                        break;
                    }
                    i = right + 1;
                } else {
                    i++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        trap(arr);
        System.out.println(trap(arr));
    }
}
