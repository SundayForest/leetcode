package look.基础提升.树形dp;

/**
 * @author sunday
 * @create 2023 --- 01 --- 20 --- 9:51
 */
public class MaxDistanceInTree {
//    树形dp 要考虑的就是 该向子节点要什么信息
    public static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int data){
            this.value = data;
        }
    }
    public static int maxDistance(Node head){
        return process(head).maxDistance;
    }
    public static class Info{
        public int maxDistance;
        public int height;
        public Info(int dis,int h){
            maxDistance = dis;
            height = h;
        }
    }
    public static Info process(Node x){
        if(x == null){
            return new Info(0,0);
        }
        Info left = process(x.left);
        Info right = process(x.right);
        int p1 = left.maxDistance;
        int p2 = right.maxDistance;
        int p3 = left.height + 1 + right.height;
        int max = Math.max(p1,Math.max(p2,p3));
        int h = Math.max(left.height , right.height) + 1;
        return new Info(max,h);
    }
}
