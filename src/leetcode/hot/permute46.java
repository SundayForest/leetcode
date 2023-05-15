package leetcode.hot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 02 --- 21 --- 20:57
 */
public class permute46 {
//    给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        process(list,nums,0,new ArrayList<>(),used);
        return list;
    }
    public void process(List<List<Integer>> list,int[] nums,int index,List<Integer> temp,boolean[] used){
        if(index == nums.length){
            list.add(new ArrayList<>(temp));
        }
        for(int i = 0; i < nums.length; i++){
            if(!used[i]){
                used[i] = true;
                temp.add(nums[i]);
                process(list,nums,index + 1,temp,used);
                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}
