package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 02 --- 22 --- 15:42
 */
public class exist79 {
//    给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
    public static boolean exist(char[][] board, String word) {
        if(word.length() > board.length * board[0].length){
            return false;
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(process(board,word,new boolean[board.length][board[0].length],0,i,j))return true;
                }
            }
        }
        return false;
    }
    public static boolean process(char[][] board,String word,boolean[][] used,int index,int i,int j){
        if(index == word.length()){
            return true;
        }
        if(i < 0 || i == used.length || j < 0 || j == used[0].length || used[i][j] || board[i][j] != word.charAt(index)){
            return false;
        }
        boolean b = false;
        used[i][j] = true;
        b = process(board, word, used, index + 1, i + 1, j);
        if(b){
            return b;
        }
        b = process(board, word, used, index + 1, i - 1, j);
        if(b){
            return b;
        }
        b = process(board, word, used, index + 1, i, j + 1);
        if(b){
            return b;
        }
        b = process(board, word, used, index + 1, i, j - 1);
        used[i][j] = false;
        return b;
    }

    public static void main(String[] args) {
        char[][] chars = {{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
//        [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
        String s = "abcced";
        exist(chars,s);
    }
}
