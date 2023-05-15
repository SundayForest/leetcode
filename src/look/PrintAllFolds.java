package look;

/**
 * @author sunday
 * @create 2022 --- 11 --- 08 --- 18:45
 */
public class PrintAllFolds {
    public static void main(String[] args) {
        int n = 3;printAllFolds(n);
    }
    public static void printAllFolds(int n){
        printProcess(1, n,true);
    }

//    递归过程中，来到了某一节点
//    i 是节点的层数， n 是一共的层数， down == true 凹 down == false 凸
    public static void printProcess(int i, int n, boolean down){
        if(i > n){
            return;
        }
        printProcess(i + 1, n ,true);
        System.out.println(down ? "凹" : "凸");
        printProcess(i + 1, n ,false);
    }
}
