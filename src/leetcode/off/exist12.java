package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 20 --- 19:14
 */
public class exist12 {
//    给定一个m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
//
//    单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。
//    同一个单元格内的字母不允许被重复使用。
public boolean exist(char[][] board, String word) {
    for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[0].length; j++){
            if(board[i][j] == word.charAt(0)){
                boolean isExist = process(i,j,board,word);
                if(isExist){
                    return true;
                }
            }
        }
    }
    return false;
}
    public boolean process(int i,int j, char[][] board,String word){
        if(word.length() == 0){
            return true;
        }
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length){

            return false;
        }

        if (board[i][j] != word.charAt(0)){
            return false;
        }
        char c = board[i][j];
        board[i][j] = '0';
        boolean isExist = false;
        isExist = process(i + 1,j,board,word.substring(1));
        if(isExist){
            return true;
        }
        isExist = process(i - 1,j,board,word.substring(1));
        if(isExist){
            return true;
        }
        isExist = process(i,j + 1,board,word.substring(1));
        if(isExist){
            return true;
        }
        isExist = process(i,j - 1,board,word.substring(1));
        if(isExist){
            return true;
        }
        board[i][j] = c;
        return false;
    }

}
