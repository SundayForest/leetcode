package look;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author sunday
 * @create 2022 --- 11 --- 05 --- 18:58
 */
// 判断一个链表是否是回文结构
public class IsPalindrome {
    public static boolean isPalindrome1(ReverseList.Node node){
        Stack<ReverseList.Node> stack = new Stack<>();
        ReverseList.Node cur = node;
        while(cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        while (node != null){
            if(node.value != stack.pop().value){
                return false;
            }
            node = node.next;
        }
        return true;
    }
}
