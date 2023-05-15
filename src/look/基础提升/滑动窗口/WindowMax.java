package look.基础提升.滑动窗口;

import java.util.LinkedList;

/**
 * @author sunday
 * @create 2023 --- 01 --- 19 --- 11:08
 */
public class WindowMax {
//    滑动窗口内的最大值
    public class Window{
        private int l;
        private int r;
        private int[] arr;
        private LinkedList<Integer> list;
        public Window(int[] a){
            arr = a;
            l = -1;
            r = 0;
            list = new LinkedList<>();
//            list 存的是下标
        }
        public void add(){
            if(r == arr.length){
                return;
            }
            while (!list.isEmpty() && arr[list.peekFirst()] <= arr[r]){
                list.pollLast();
            }
            list.add(r);
            r++;
        }
        public void remove(){
            if(l >= r - 1){
                return;
            }
            l++;
            if(list.peekFirst() == l){
                list.pollFirst();
//                如果目前最大值确实是被移除的数
            }
        }
        public Integer getMax(){
            if(!list.isEmpty()){
                return arr[list.peekFirst()];
            }
            return null;
        }
    }
    public int[] getMaxWindowList(int[] arr,int w){
        if(arr == null || w < 1 || arr.length < w){
            return null;
        }
        LinkedList<Integer> list = new LinkedList<>();
        int[] res = new int[arr.length - w + 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            while (!list.isEmpty() && arr[list.pollFirst()] <= arr[i]){
                list.pollLast();
            }
            list.addLast(i);
            if(list.peekFirst() == i - w){
//                下标过期
                list.pollFirst();
            }
            if(i >= w - 1){
                res[index++] = arr[list.peekFirst()];
            }
        }
        return res;
    }
}
