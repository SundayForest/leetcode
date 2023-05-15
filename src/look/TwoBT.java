package look;

import javax.management.Query;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author sunday
 * @create 2022 --- 11 --- 06 --- 18:56
 */
public class TwoBT {
    public static class Node{
        int value;
        Node right;
        Node left;
        public Node(int value){
            this.value = value;
        }
    }
//二叉树先序遍历
    public static void pre(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.value);
        pre(head.left);
        pre(head.right);
    }

//    二叉树中序遍历
public static void in(Node head){
    if(head == null){
        return;
    }
    in(head.left);
    System.out.println(head.value);
    in(head.right);
}
//    二叉树后序遍历
public static void pso(Node head){
    if(head == null){
        return;
    }
    pso(head.left);
    pso(head.right);
    System.out.println(head.value);
}

// 二叉树宽度优先遍历
    public static void level(Node head){
        if(head == null){
            return;
        }
//        queue是队列
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            System.out.println(cur.value);
            if(cur.left!=null){
                queue.add(cur.left);
            }
            if(cur.right!=null){
                queue.add(cur.right);
            }
        }
    }

//    求二叉树最大宽度
    public static int maxWidthUseMap(Node head){
        if(head==null){
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        Node curEnd = head; //当前层，最右节点
        Node nextEnd = null; //下一层，最右节点
        int max = 0;
        int curLevelNodes = 0;
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur.left!=null){
                queue.add(cur.left);
                nextEnd = cur.left;
            }
            if(cur.right!=null){
                queue.add(cur.right);
                nextEnd = cur.right;
            }
            curLevelNodes++;
            if(cur == curEnd){
                max = Math.max(max,curLevelNodes);
                curLevelNodes = 0;
                curEnd = nextEnd;
            }
        }
        return max;
    }
//   先序序列化
    public static Queue<String> preSerial(Node head){
        Queue<String> ans = new LinkedList<>();
        pres(head,ans);
        return ans;
    }

    public static void pres(Node head,Queue<String> ans){
        if(head == null){
            ans.add(null);
        }else{
            ans.add(String.valueOf(head.value));
            pres(head.left,ans);
            pres(head.right,ans);
        }
    }
    public static Node buildByPreQueue(Queue<String> ans){
        if(ans == null || ans.size() == 0){
            return null;
        }
        return preb(ans);
    }

    public static Node preb(Queue<String> ans){
        String value = ans.poll();
        if(value == null){
            return null;
        }
        Node head = new Node(Integer.valueOf(value));
        head.left = preb(ans);
        head.right = preb(ans);
        return head;
    }
}
