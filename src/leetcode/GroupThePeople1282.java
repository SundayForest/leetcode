package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author sunday
 * @create 2022 --- 11 --- 22 --- 20:48
 */

//有 n 个人被分成数量未知的组。每个人都被标记为一个从 0 到 n - 1 的唯一ID。
//
//给定一个整数数组 groupSizes ，其中groupSizes[i]是第 i 个人所在的组的大小。例如，如果groupSizes[1] = 3，
// 则第 1 个人必须位于大小为 3 的组中。
//
//返回一个组列表，使每个人 i 都在一个大小为 groupSizes[i] 的组中。
//
//每个人应该 恰好只 出现在 一个组 中，并且每个人必须在一个组中。如果有多个答案，返回其中任何一个。可以保证
// 给定输入至少有一个有效的解。
public class GroupThePeople1282 {
    public static void main(String[] args) {
        int[] n = {3,3,3,3,3,1,3};
        groupThePeople(n);
    }
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        for(int i = 0; i < groupSizes.length; i++){
            if(!hashMap.containsKey(groupSizes[i])){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                if(list.size() == groupSizes[i]){
                    res.add(list);
                    List<Integer> newList = new ArrayList<>();
                    hashMap.put(groupSizes[i],newList);
                }else {
                    hashMap.put(groupSizes[i], list);
                }
            }else{
                List<Integer> list = hashMap.get(groupSizes[i]);
                list.add(i);
                if(list.size() == groupSizes[i]){
                    res.add(list);
                    List<Integer> newList = new ArrayList<>();
                    hashMap.put(groupSizes[i],newList);
                }
            }
        }
        return res;
    }
}
