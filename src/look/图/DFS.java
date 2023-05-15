package look.图;

import java.util.HashSet;
import java.util.Stack;

/**
 * @author sunday
 * @create 2022 --- 11 --- 11 --- 14:33
 */
public class DFS {
//    深度优先遍历
    public static void dfs(Node node){
        if(node == null){
            return;
        }
//        栈记录了深度优先遍历的目前路径
        Stack<Node> stack = new Stack<>();
        HashSet<Node> set = new HashSet<>();
        stack.add(node);
        set.add(node);
        System.out.println(node.value);
        while(!stack.isEmpty()){
            Node cur = stack.pop();
            for(Node n : cur.nexts){
                if(!set.contains(n)){
                    stack.push(cur);
                    stack.push(n);
                    set.add(n);
                    System.out.println(n.value);
                    break;
                }
            }
        }
    }
}
