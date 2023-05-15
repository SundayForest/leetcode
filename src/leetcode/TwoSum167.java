package leetcode;

/**
 * @author sunday
 * @create 2022 --- 10 --- 31 --- 8:33
 */
public class TwoSum167 {
    public static int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length - 1;i++){
            int low = i + 1;
            int high = numbers.length - 1;
            int mid;
            while(true){
                if(high - low < 5){
                    for(int j = low; j <= high;j++){
                        if(numbers[i] + numbers[j] == target){
                            return new int[]{i + 1,j + 1};
                        }
                    }
                    break;
                }
                mid = low + (high - low) / 2;
                if(numbers[i] + numbers[mid] == target){
                    return new int[]{i + 1,mid + 1};
                }else if(numbers[i] + numbers[mid] < target){
                    low = mid;
                }else{
                    high = mid;
                }
            }
        }
        return null;
    }
}
