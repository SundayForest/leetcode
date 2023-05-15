package look;

/**
 * @author sunday
 * @create 2022 --- 11 --- 08 --- 20:29
 */
public class IsBalanced {
    public static class Node{
        public int value;
        public Node right;
        public Node left;
    }
    public static class Info{
        public boolean isBalanced;
        public int height;
        public Info(boolean isBalanced,int height){
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    public static Info process(Node x){
        if(x == null){
            return new Info(true,0);
        }
        Info left = process(x.left);
        Info right = process(x.right);
        int height = Math.max(left.height, right.height) + 1;
        boolean isBalanced = true;
        if(!left.isBalanced || !right.isBalanced || Math.abs(left.height - right.height) > 1){
            isBalanced = false;
        }
        return new Info(isBalanced,height);
    }
}
