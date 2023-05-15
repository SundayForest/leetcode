package leetcode.hot;

import java.util.*;

/**
 * @author sunday
 * @create 2023 --- 03 --- 11 --- 21:41
 */
public class 流星 {
    public int[] process(int[] s,int[] t){
        PriorityQueue<Temp> queue = new PriorityQueue<>((a,b)->a.t - b.t);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            queue.add(new Temp(s[i],t[i]));
            set.add(s[i]);
            set.add(t[i]);
        }
        int[] arr = new int[set.size()];
        int index = 0;
        for (Integer i:set
             ) {
            arr[index++] = i;
        }
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++){
            ArrayList arrayList = new ArrayList();
            arrayList.remove(1);
        }
        return null;
    }

    public static void main(String[] args) {
        PriorityQueue<Temp> queue = new PriorityQueue<>((a,b)->a.t - b.t);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        queue.add(new Temp(1,3));
        queue.add(new Temp(1,3));
        queue.add(new Temp(2,6));
        queue.add(new Temp(5,7));
        Integer[] o = (Integer[]) set.toArray();
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i]);
        }
        for (Temp t :
                queue) {
            System.out.print(t.t + "--");
            System.out.println(t.s);
        }
    }

}
class Temp{
    int s;
    int t;

    public Temp(int s, int t) {
        this.s = s;
        this.t = t;
    }
}
class Big{
    Temp temp;
    int time;

    public Big(Temp temp, int time) {
        this.temp = temp;
        this.time = time;
    }
}
