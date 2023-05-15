package look.中级提升;

import java.util.HashMap;

/**
 * @author sunday
 * @create 2023 --- 02 --- 16 --- 19:03
 */
public class IsDivToSameFor {
//    一个数组是否可以切分成 4 个相同累加和的小数组，被切分的值（一刀一个）不计算
    public boolean canSplit(int[] arr){
        if(arr == null || arr.length < 7){
            return false;
        }
//        key 是累加和 ；value 是位置
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++){
            map.put(sum,i);
            sum += arr[i];
        }
        int left = arr[0];
        for(int s1 = 1;s1 < arr.length - 5; s1++){
            int check = left * 2 + arr[s1];
            if(map.containsKey(check)){
                int s2 = map.get(check);
                check += left + arr[s2];
                if(map.containsKey(check)){
                    int s3 = map.get(check);
                    if(check + arr[s3] + left == sum){
                        return true;
                    }
                }
            }
            left += arr[s1];
        }
        return false;
    }
}
