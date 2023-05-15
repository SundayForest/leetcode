package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 11 --- 19:38
 */
public class FloodFill08_10 {
    public static void main(String[] args) {
        int[][] im = {{1,1,1},{1,1,0},{1,0,1}};
        floodFill(im,1,1,2);


    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor){
            return image;
        }
        process(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }
    public static void process(int[][] image, int sr, int sc,int newColor,int oldColor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldColor){
            return;
        }
        image[sr][sc] = newColor;
        process(image,sr-1,sc,newColor,oldColor);
        process(image,sr+1,sc,newColor,oldColor);
        process(image,sr,sc-1,newColor,oldColor);
        process(image,sr,sc+1,newColor,oldColor);
    }
}
