package leetcode.hot;

import java.util.*;

/**
 * @author sunday
 * @create 2023 --- 02 --- 22 --- 15:08
 */
public class subsets78 {
//    给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
//
//  解集 不能 包含重复的子集。你可以按 任意顺序 返回解集
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        Arrays.sort(nums);
        dfs(list,new ArrayList<>(),new boolean[nums.length],nums,0,set);
        return list;
    }
    public static void dfs(List<List<Integer>> list,List<Integer> path,boolean[] used,int[] nums,int count,HashSet<String> set){
        if(count == nums.length + 1){
            int[] arr = new int[path.size()];
            for(int i = 0; i < path.size(); i++){
                arr[i] = path.get(i);
            }
            Arrays.sort(arr);
            String s = "";
            for(int i = 0; i < arr.length; i++){
                s = s +  "-" + arr[i];
            }
            if(set.contains(s)){
                return;
            }
            set.add(s);
            list.add(new ArrayList<>(path));
            return;
        }
        for(int i = count; i < used.length; i++){
            if(!used[i]){
                path.add(nums[i]);
                used[i] = true;
                dfs(list,path,used,nums,count + 1,set);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
        dfs(list,path,used,nums, count + 1,set);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        subsets(arr);
        System.out.println(subsets(arr));
    }
}
