package leetcode.hot;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 03 --- 07 --- 20:57
 */
public class Magical {
    public int process(int n,int k,int[] arr){
        int res = 2 * k - n;
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(-5 >>> 1);
        System.out.println(-5 >> 1);
    }
    LinkedList<People> list = new LinkedList<>();
    public int go(){
        return list.remove(0).id;
    }
    public void in(){
        int low = 0;
        int high = list.size();
        int mid = low + (high - low) >> 1;
        while (true){
            if(high - low < 10){
                for(int i = low; i<=high ;i++){

                }
            }
        }
    }
    class People{
        int id;
        int p;
    }

}
