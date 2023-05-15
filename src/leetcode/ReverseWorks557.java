package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 01 --- 23:56
 */
public class ReverseWorks557 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String res = "";
        for(int i = 0; i < arr.length; i++){
            int low = 0;
            int high = arr[i].length() - 1;
            char[] chars = arr[i].toCharArray();
            while(low < high){
                char temp = chars[low];
                chars[low++] = chars[high];
                chars[high--] = temp;
            }
            String now = new String(chars);
            res += now;
            if(i != arr.length - 1){
                res += " ";
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "asdadada";
        System.out.println(s.length());
        System.out.println(s.toCharArray()[2]);
        String h  = new String(s.toCharArray());
        System.out.println(h);


    }
}
