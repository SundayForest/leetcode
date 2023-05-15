package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 04 --- 18:11
 */
public class FindNums {
    public int find(int [] arr,int min,int max){
        if(arr == null || arr.length == 0){
            return 0;
        }
        if(arr[arr.length- 1] <= min || arr[0] >= max){
            return 0;
        }
        if(arr[arr.length - 1] < max && arr[0] > min){
            return arr.length;
        }
        int low = 0;
        int high = arr.length - 1;
        int mid = low + (high - low) / 2;
        int pre = -1;
        int tail = -1;
        while (true){
            if(high - low < 10){
                for(int i = low; i < high - 1; i++){
                    if(arr[i] > min){
                        pre = i;
                        break;
                    }
                }
                break;
            }
            if(arr[mid] > min && arr[mid - 1] <= min){
                pre = mid;
                break;
            }
            if(arr[mid] < min){
                low = mid;
            }else{
                high = mid;
            }
            mid = low + (high - low) / 2;
        }
        low = pre;
        high = arr.length - 1;
        mid = low + (high - low) / 2;
        while (true){
            if(high - low < 10){
                for(int i = high; i >= low ; i--){
                    if(arr[i] < max){
                        tail = i;
                        break;
                    }
                }
                break;
            }
            if(arr[mid] < max && arr[mid + 1] >= max){
                tail = mid;
                break;
            }
            if(arr[mid] < max){
                low = mid;
            }else{
                high = mid;
            }
            mid = low + (high - low) / 2;
        }
        return tail - pre + 1;
    }
}

class test{
    public static void main(String[] args) {
        FindNums findNum = new FindNums();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        System.out.println(findNum.find(arr,0,100));
        System.out.println(findNum.find(arr,5,9));
        System.out.println(findNum.find(arr,1,18));
        System.out.println(findNum.find(arr,20,100));
    }
}
