package look.中级提升;

import java.util.HashSet;

/**
 * @author sunday
 * @create 2023 --- 02 --- 18 --- 15:28
 */
public class isRectangleCover {
//    给定 任意个矩形， 在他们都在原地的情况下，他们拼出来的图像是否 是一个严丝合缝的矩形
//    1.矩形和等于该四点范围
//    2.除四个顶点之外的每个顶点，都要是出现偶数次
    public boolean isRectangle(int[][] rectangles){
        if(rectangles.length == 0 || rectangles[0].length == 0){
            return false;
        }
        int xl = Integer.MIN_VALUE;
        int xr = Integer.MIN_VALUE;
        int yd = Integer.MIN_VALUE;
        int yu   = Integer.MIN_VALUE;
        HashSet<String> set = new HashSet<>();
        int area = 0;//矩形累加面积和
        for(int[] rect : rectangles){
            xl = Math.min(xl,rect[0]);
            xr = Math.min(xr,rect[1]);
            yd = Math.min(yd,rect[2]);
            yu = Math.min(yu,rect[3]);
            area += (rect[2] - rect[0]) * (rect[3] - rect[1]);
            String s1 = rect[0] + "-" + rect[1];
            String s2 = rect[0] + "-" + rect[3];
            String s3 = rect[2] + "-" + rect[3];
            String s4 = rect[2] + "-" + rect[1];
            if(!set.add(s1))set.remove(s1);
            if(!set.add(s2))set.remove(s2);
            if(!set.add(s3))set.remove(s3);
            if(!set.add(s4))set.remove(s4);
//            上面就是，出现偶数次，set里没这个点，set有则代表奇数次
        }
        if (!set.contains(xl + "-" + yd) || !set.contains(xl + "-" + yu) || !set.contains(xr + "-" + yd) ||
        !set.contains(xr + "-" + yu) || set.size() != 4){
            return false;
        }
//        判断是否只有四个点且四个顶点都在
        return area == (xr - xl) * (yu - yd);
//        判断面积是否和范围相同
    }
}
