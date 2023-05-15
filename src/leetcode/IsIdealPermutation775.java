package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 16 --- 22:19
 */
public class IsIdealPermutation775 {
//    给你一个长度为 n 的整数数组 nums ，表示由范围 [0, n - 1] 内所有整数组成的一个排列。
//全局倒置 的数目等于满足下述条件不同下标对 (i, j) 的数目：
//0 <= i < j < n
//nums[i] > nums[j]
//局部倒置 的数目等于满足下述条件的下标 i 的数目：
//0 <= i < n - 1
//nums[i] > nums[i + 1]
//当数组 nums 中 全局倒置 的数量等于 局部倒置 的数量时，返回 true ；否则，返回 false 。
    public static boolean isIdealPermutation(int[] nums) {
        Data[] datas = new Data[nums.length];
        Data data = process(nums,0,datas);
        if(!data.flag){
            return data.flag;
        }
        if(nums.length > 1){
            data = process(nums,1,datas);
            return data.flag;
        }
        return data.flag;
    }
    public static Data process(int[] nums,int cur,Data[] datas){
        Data data = new Data();
        if(nums.length - cur < 100){
            if(datas[cur] != null){
                return datas[cur];
            }
            for(int i = cur; i < nums.length; i++){
                for(int j = i + 2; j < nums.length; j++){
                    if(nums[j] < nums[i]){
                        data.flag = false;
                        return data;
                    }
                }
            }
            data.value = nums[cur];
            if(cur + 1 < nums.length){
                data.next = nums[cur+1];
            }
            data.flag = true;
            return data;
        }
        if(datas[cur] != null){
            return datas[cur];
        }
        if(datas[cur + 2] != null){
            data = datas[cur + 2];
        }else {
            data = process(nums, cur + 2, datas);
        }
        if(data.flag == false){
            return data;
        }
        if(data.value < nums[cur] || data.next < nums[cur]){
            data.flag = false;
            datas[cur] = data;
            return data;
        }
        data.value = nums[cur];
        if(cur + 1 < nums.length){
            data.next = nums[cur+1];
        }
        datas[cur] = data;
        return data;
    }
    public static class Data{
        public int value;
        public int next;
        public boolean flag;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1,0,3,2,4,6,5,8,7,10,9,12,11,13,15,14,16,18,17,19,20,21,23,22,25,24,26,27,28,29,30,32,31,33,35,34,37,36,39,38,41,40,43,42,44,45,47,46,49,48,50,51,53,52,55,54,56,58,57,59,61,60,62,64,63,65,66,67,68,69,70,71,72,73,75,74,76,77,78,80,79,81,82,84,83,86,85,87,89,88,90,92,91,94,93,95,96,97,98,100,99};        isIdealPermutation(ints);
        System.out.println(isIdealPermutation(ints));
    }
}
