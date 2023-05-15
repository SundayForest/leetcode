package look;

import java.util.Stack;

/**
 * @author sunday
 * @create 2022 --- 11 --- 05 --- 16:13
 */
// 前缀树   可以以o（n）的代价建立，可以快速查询 字符串是否存在 以及 以某某字符串为前缀的字符串数量
public class TireTree {
    public static class Node{
        public int pass;
        public int end;
        public Node[] nexts;
        public Node(){
            pass = 0;
            end = 0;
//            0 a
//            1 b
//            ...
//            25 z
//          nexts[i] == null i方向上的路不存在
//          nexts【i】 ！= null i方向上的路存在
            nexts = new Node[26];
        }
    }
    public static class Trie{
        private Node root;
        public Trie(){
            root = new Node();
        }
        public void insert(String word){
            if(word == null){
                return;
            }
            char[] ch = word.toCharArray();
            Node node = root;
            node.pass++;
            int index = 0;
            for (int i = 0; i < ch.length; i++){
                index = ch[i] - 'a';
                if(node.nexts[index] == null){
                    node.nexts[index] = new Node();
                }
                node = node.nexts[index];
                node.pass++;
            }
            node.end++;
        }

        public int search(String word){
            if(word == null){
                return 0;
            }
            char[] ch = word.toCharArray();
            Node node = root;
            int index = 0;
            for(int i = 0; i < ch.length; i++){
                index = ch[i] - 'a';
                if(node.nexts[index] == null){
                    return 0;
                }
                node = node.nexts[index];
            }
            return node.end;
        }
        public int prefixNumber(String pre){
            if(pre == null){
                return 0;
            }
            char[] ch = pre.toCharArray();
            Node node = root;
            int index = 0;
            for(int i = 0; i < ch.length; i++){
                index = ch[i] - 'a';
                if(node.nexts[index] == null){
                    return 0;
                }
                node = node.nexts[index];
            }
            return node.pass;
        }
        public void deletd(String word){
            if(search(word) != 0){
                    char[] ch = word.toCharArray();
                    Node node = root;
                    node.pass--;
                    int index = 0;
                    for(int i = 0; i < ch.length; i++){
                        index = ch[i] - 'a';
                        if(--node.nexts[index].pass == 0){
                            node.nexts[index] = null;
                            return;
                        }
                        node = node.nexts[index];
                    }
                    node.end--;

            }
        }
    }


}
