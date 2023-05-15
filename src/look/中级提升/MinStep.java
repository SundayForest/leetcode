package look.中级提升;

/**
 * @author sunday
 * @create 2023 --- 02 --- 15 --- 19:59
 */
public class MinStep {
//    求从数组第一个位置到最后一个位置，最小步数
//    数组数字代表可以一次走几步
    public int jump(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }
        int step = 0; //跳了多少步
        int cur = 0; //当前最大可到
        int next = 0; //下一步最大可到
        for(int i = 0;i < arr.length; i++){
            if(i > cur){
                step++;
                cur = next;
            }
            next = Math.max(next,i + arr[i]);
        }
        return step;
    }
}
