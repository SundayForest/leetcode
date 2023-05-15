package look;

import java.util.PriorityQueue;

/**
 * @author sunday
 * @create 2022 --- 11 --- 10 --- 14:45
 */
public class LessMoneySplit {
//    拆分金条，拆分时耗费此时长度的钱，求最小耗费
//    解题思路即 哈夫曼树

    public static void main(String[] args) {
        int[] a = {1,7,5,9,2,8,3,7,11,6,5};
        System.out.println(lessMoney(a));
    }
    public static int lessMoney(int[] arr){
//        小根堆
        PriorityQueue<Integer> array = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            array.add(arr[i]);
        }
        int sum = 0;
        int cur = 0;
        while(array.size() > 1){
            cur = array.poll() + array.poll();
            sum += cur;
            array.add(cur);
        }
        return sum;
    }
}
