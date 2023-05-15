package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 17 --- 11:14
 */
public class Find43 {
    public int[] search(int[] nums,int target){
        if(nums == null || nums.length < 1){
            return null;
        }
        int[] res = {0,0};
        int low = 0;
        int high = nums.length - 1;
        int point = low + (high - low) / 2;
        while (nums[point] != target){
            point = nums[point] > target ? low + (point - low) / 2 : point + (high - point) / 2;
        }
        int hl = 0;
        int hh = point;
        int hp = hl + (hh - hl) / 2;
        while(hp != 0){
            if(nums[hp] == target && nums[hp - 1] != target){
                break;
            }
            hp = nums[hp] == target ? hl + (hp - hl) / 2 : hp + (hh - hp) / 2;
        }
        res[0] = hp;
        int tl = point;
        int th = nums.length - 1;
        if(tl == th || nums[th] == target){
            res[1] = th;
            return res;
        }
        int tp = tl + (th - tl) / 2;
        while(true){
            if(nums[tp] == target && nums[tp + 1] != target){
                res[1] = tp;
                return res;
            }
            tp = nums[tp] > target ? tl + (tp - tl) / 2 : tp + (th - tp) / 2;
        }
    }
}
