package look.暴力递归和动态规划等;

import java.util.HashMap;

/**
 * @author sunday
 * @create 2022 --- 11 --- 20 --- 17:30
 */
public class CoinsWay {
//    记忆化搜索
    public static int way2(int[] arr,int aim){
        if(arr == null || arr.length < 1 || aim < 0){
            return 0;
        }
        HashMap<String,Integer> hashMap = new HashMap<>();
        return process2(arr,0,aim,hashMap);
    }

    public static int process2(int[] arr,int index,int rest,HashMap<String,Integer> hashMap){
        if(hashMap.containsKey(index + "_" + rest)){
            return hashMap.get(index + "_" + rest);
        }
        if(rest < 0){
            hashMap.put(index + "_" + rest,0);
            return 0;
        }
        if(index == arr.length){
            hashMap.put(index + "_" + rest, rest == 0 ? 1 : 0);
            return hashMap.get(index + "_" + rest);
        }
        int ways = 0;
        for(int i = 0; i * arr[index] <= rest;i++){
            ways += process2(arr,index+1,rest - i * arr[index],hashMap);
        }
        hashMap.put(index + "_" + rest,ways);
        return ways;
    }
    public static int way(int[]arr,int aim){
        if(arr == null || arr.length < 1 || aim < 0){
            return 0;
        }
        return process(arr,0,aim);
    }

    public static int process(int[] arr,int index,int rest){
        if(rest < 0){
            return 0;
        }
        if(index == arr.length){
            return rest == 0 ? 1 : 0;
        }
        int ways = 0;
        for(int i = 0; i * arr[index] <= rest;i++){
            ways += process(arr,index+1,rest - i * arr[index]);
        }
        return ways;
    }


}
