package look.算法;

import java.util.*;

/**
 * @author sunday
 * @create 2022 --- 12 --- 18 --- 16:16
 */
public class RedAndBlueBone {
//    一批 3 个数字的数组，当第一个数为 0 时，可以改变，非 0 时后俩个数无效，第 2 个数为转化为 1 的代价， 第 3 个数
//    为转化为 2 的代价，必须要求所有的 1 和 2 最后数量相等，求最小代价或失败。


//    解决方案： 先遍历一遍，求的所有 1 和 2，如果 1 和 2 的数量有一个已经超出一半，则失败，否则
//              先全转化代价为 1 ，然后求所有 代价 1 - 代价 2 最大的，这就是改成 2 最合适的，将代价减去他们，直到
//              1 和 2 数量ok
    public int process(List<int[]> list){
        if(list == null ||list.size() == 0 || list.size() % 2 == 1){
            return -1;
        }
        int num1 = 0;
        int num2 = 0;
        int price = 0;
//        以下为大根堆， 如果不写比较器则为小根堆
        PriorityQueue<Integer> heap = new PriorityQueue<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                }
        );
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)[0] == 0){
                price += list.get(i)[1];
                heap.add(list.get(i)[1] - list.get(i)[2]);
            }else if(list.get(i)[0] == 1){
                num1++;
            }else{
                num2++;
            }
        }
        if(num1 > list.size() / 2 || num2 > list.size() / 2){
            return -1;
        }
        for(int i = 0; i < list.size() / 2 - num2; i++){
            price -= heap.poll();
        }
        return price;
    }
}
