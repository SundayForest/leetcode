package look;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author sunday
 * @create 2022 --- 11 --- 10 --- 15:17
 */
public class IPO {
    public static class Program{
        int p;
        int c;
        public Program(int p,int c){
            this.p = p;
            this.c = c;
        }
    }

    public static class MinCostComparator implements Comparator<Program> {

        @Override
        public int compare(Program o1, Program o2) {
            return o1.c - o2.c;
        }
    }

    public static class MaxProfitComparator implements Comparator<Program>{

        @Override
        public int compare(Program o1, Program o2) {
            return o2.p - o1.p;
        }
    }
    public static int findMaxC(int k,int w,int[] ps,int[] cs){
        PriorityQueue<Program> min = new PriorityQueue<>(new MinCostComparator());
//        根据花费的小根堆（封印的）
        PriorityQueue<Program> max = new PriorityQueue<>(new MaxProfitComparator());
//        根据收入的大根堆（解锁的）
        for(int i = 0; i < ps.length; i++){
            min.add(new Program(ps[i],cs[i]));
        }
        for(int i = 0; i < k; i++){
            while(!min.isEmpty() && min.peek().c <= w){
                max.add(min.poll());
            }
            if(max.isEmpty()){
                return w;
            }
            w += max.poll().c;
        }
        return w;
    }
}
