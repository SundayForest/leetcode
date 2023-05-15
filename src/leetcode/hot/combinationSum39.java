package leetcode.hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 02 --- 21 --- 19:24
 */
public class combinationSum39 {
//    给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，找出 candidates 中可以使数字和为目标数target
//    的 所有不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。
//candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。
//对于给定的输入，保证和为 target 的不同组合数少于 150 个

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        process(0,target,candidates,list,new ArrayList<>());
        return list;
    }
    public static void process(int index,int target,int[] candidates,List<List<Integer>> big,List<Integer> little){
        if(target == 0){
            List<Integer> list = new ArrayList();
            for (int i = 0; i < little.size(); i++){
                list.add(little.get(i));
            }
            big.add(list);
            return;
        }
        if(target < 0 || index == candidates.length){
            return;
        }
        for (int i = 0; ;i++){
            if(candidates[index] * i <= target){
                for(int j = 0; j < i; j++){
                    little.add(candidates[index]);
                }
                process(index + 1,target - candidates[index] * i,candidates,big,little);
                for(int j = 0; j < i; j++){
                    little.remove(little.size() - 1);
                }
            }else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr ={2,3,6,7};
        combinationSum(arr,7);
    }
}
