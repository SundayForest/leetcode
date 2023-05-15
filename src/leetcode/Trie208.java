package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 15 --- 23:53
 */
public class Trie208 {
    MyNode root;
    public class MyNode{
        int pass;
        int end;
        MyNode[] next;
        public MyNode(){
            pass = 0;
            end = 0;
            next = new MyNode[26];
        }
    }
    public Trie208() {
        root = new MyNode();
    }

    public void insert(String word) {
        MyNode cur = root;
        cur.pass++;
        for(int i = 0; i < word.length(); i++){
           if(cur.next[word.charAt(i) - 'a'] == null){
               cur.next[word.charAt(i) - 'a'] = new MyNode();
           }
            cur = cur.next[word.charAt(i) - 'a'];
            cur.pass++;
        }
        cur.end++;
    }

    public boolean search(String word) {
        MyNode cur = root;
        for(int i = 0; i < word.length(); i++){
            if(cur.next[word.charAt(i) - 'a'] == null){
                return false;
            }
            cur = cur.next[word.charAt(i) - 'a'];
        }
        if(cur.end == 0){
            return false;
        }
        return true;

    }

    public boolean startsWith(String prefix) {
        MyNode cur = root;
        for(int i = 0; i < prefix.length(); i++){
            if(cur.next[prefix.charAt(i) - 'a'] == null){
                return false;
            }
            cur = cur.next[prefix.charAt(i) - 'a'];
        }
        return true;
    }
}
