package look.中级提升;

import look.图.P;

import java.util.PriorityQueue;

/**
 * @author sunday
 * @create 2023 --- 02 --- 15 --- 20:16
 */
public class TopKSumCrossTwoArrays {
//    求俩个正序数组的前 k 个最大和，每个数组每次只出 1 个数
    public class Point{
        int x;
        int y;
        int sum;
        public Point(int x,int y,int sum){
            this.x = x;
            this.y = y;
            this.sum = sum;
        }
    }

    public int[] TopKSum(int[] arr1,int[] arr2,int topK){
        if(arr1 == null || arr2 == null || topK < 1){
            return null;
        }
        topK = Math.min(topK,arr1.length * arr2.length);
        int[] res = new int[topK];
        int resIndex = 0;
        PriorityQueue<Point> queue = new PriorityQueue<>( (a,b) ->  b.sum - a.sum);
        boolean[][] booleans = new boolean[arr1.length][arr2.length];
        int i1 = arr1.length - 1;
        int i2 = arr2.length - 1;
        queue.add(new Point(i1,i2,arr1[i1] + arr2[i2]));
        while (resIndex != topK){
            Point cur = queue.poll();
            res[resIndex++] = cur.sum;
            i1 = cur.x;
            i2 = cur.y;
            if( i1 - 1 >= 0  && !booleans[i1 - 1][i2] ){
                booleans[i1 - 1][i2] = true;
                queue.add(new Point(i1 - 1,i2,arr1[i1-1] + arr2[i2]));
            }
            if( i2 - 1 >= 0 && !booleans[i1][i2 - 1]){
                booleans[i1][i2 - 1] = true;
                queue.add(new Point(i1 ,i2 - 1,arr1[i1] + arr2[i2 - 1]));
            }
        }
        return res;
    }
}
