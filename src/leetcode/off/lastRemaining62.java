package leetcode.off;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 01 --- 26 --- 13:39
 */
public class lastRemaining62 {
//    0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。
//    求出这个圆圈里剩下的最后一个数字。
        public static int lastRemaining(int n, int m) {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add(i);
            }
            int point = m - 1;
            point = point % list.size();
            while (list.size() != 1){
                list.remove(point);
                point += (m - 1);
                point = point % list.size();
            }
            return list.get(0);
        }

    public static void main(String[] args) {
            lastRemaining(5,3);
            System.out.println(lastRemaining(5,3));

    }
}
