package leetcode;

import java.util.HashSet;

/**
 * @author sunday
 * @create 2022 --- 11 --- 21 --- 21:18
 */
public class SetZeros73 {
//    给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。

    //    看的题解：  从【1，1】遍历，当发现0的时候，把行列头都改成0，然后再次从【1，1】遍历，如果行列为0，就是变成0，
    //    同时一开始设置变量记录第0行和第0列是否需要变成0，不直接从【0，0】开始是因为会直接修改行列，导致出现全为0
    public void setZeroes(int[][] matrix) {
        HashSet<Place> hashSet = new HashSet<>();
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    hashSet.add(new Place(i,j));
                }
            }
        }
        HashSet<Integer> h = new HashSet<>();
        HashSet<Integer> l = new HashSet<>();
        for(Place place : hashSet){
            h.add(place.i);
            l.add(place.j);
        }
        for(Integer i : h){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = 0;
            }
        }
        for(Integer j : l){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][j] = 0;
            }
        }

    }
    public class Place{
        int i;
        int j;
        public Place(int i,int j){
            this.i = i;
            this.j = j;
        }
    }
}
