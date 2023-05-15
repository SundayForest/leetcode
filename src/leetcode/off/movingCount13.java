package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 20 --- 19:33
 */
public class movingCount13 {
//    地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
//    一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），
//    也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，
//    因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？

    public static int movingCount(int m, int n, int k) {
        int[][] arr = new int[m][n];
        int count = 0;
        process(0,0,arr,k);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 2){
                    count++;
                }
            }
        }
        return count;
    }
    public static void process(int i,int j,int[][] arr,int k){
        if(i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] != 0){
            return;
        }
        int num = 0;
        int i2 = i;
        int j2 = j;
        while (i != 0){
            num += i % 10;
            i /= 10;
        }
        while(j != 0){
            num += j % 10;
            j /= 10;
        }
        if(num > k){
            arr[i2][j2] = 1;
            return;
        }
        arr[i2][j2] = 2;
        process(i2 - 1,j2,arr,k);
        process(i2 + 1,j2,arr,k);
        process(i2,j2 - 1,arr,k);
        process(i2,j2 + 1,arr,k);
    }

    public static void main(String[] args) {
        movingCount(2,3,1);
        System.out.println(movingCount(2,3,1));
    }
}
