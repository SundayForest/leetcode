package leetcode.off;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author sunday
 * @create 2023 --- 01 --- 21 --- 21:06
 */
public class MedianFinder {
//    维护一个结构，从数据流中往结构添加数据，要求能提供得到中位数的方法
//    解题思路：维护一个大根堆，维护一个小根堆，大根堆维护小于平均数的值，小根堆维护大于平均数的值，
//    数字进来后，和平均数作比较决定去哪个堆，同时维持大根堆数量大于小根堆 1 或者 相等，即可维护此结构
    PriorityQueue<Integer> small;
    PriorityQueue<Integer> big;
    public MedianFinder() {
        small = new PriorityQueue<>((a,b) -> (b - a));
        big = new PriorityQueue<>((a,b) -> (a - b));
    }

    public void addNum(int num) {
        if(small.size() == 0){
            small.add(num);
        }else if(big.size() == 0){
            if(small.peek() > num){
                big.add(small.poll());
                small.add(num);
            }else {
                big.add(num);
            }
        }else{
            double aver = findMedian();
            if(num < aver){
                small.add(num);
                if(small.size() - big.size() == 2){
                    big.add(small.poll());
                }
            }else{
                big.add(num);
                if(small.size() - big.size() == -1){
                    small.add(big.poll());
                }
            }
        }
    }

    public double findMedian() {
        double aver;
        if((small.size() + big.size()) % 2 == 0){
            aver = small.peek() + (big.peek() - small.peek()) / 2.0;
        }else{
            aver = small.peek();
        }
        return aver;
    }
}
class j{
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(-1);
        medianFinder.addNum(-2);
        medianFinder.addNum(-3);
        medianFinder.findMedian();
        System.out.println(medianFinder.findMedian());
    }
}
