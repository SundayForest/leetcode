package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 04 --- 14:49
 */
public class FloodFill733 {
        static int i = -1;
    public static void main(String[] args) {
        int[][] image = {{0,0,0},{0,0,0}};
        floodFill(image,1,0,2);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(i == -1){
            i = image[sr][sc];
        }

        if(sr < image.length && sr >= 0 && sc < image[0].length && sc >= 0){
            if(color == image[sr][sc]){return image;}
            if(image[sr][sc] == i){
                image[sr][sc] = color;
                image = floodFill(image,sr+1,sc,color);
                image = floodFill(image,sr-1,sc,color);
                image = floodFill(image,sr,sc-1,color);
                image = floodFill(image,sr,sc+1,color);
                return image;
            }
        }else{
            return image;
        }
        return image;
    }
}
