package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 13 --- 23:12
 */
public class RomanToInt {
//    给定一个罗马数字，将其转换成整数。
public static void main(String[] args) {
    int i  = romanToInt("III");
    System.out.println(i);
}
    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int res = 0;
        for(int i = 0; i< chars.length; ){
            if(chars[i] == 'I'){
                if(i + 1 < chars.length && chars[i + 1] == 'V'){
                    res += 4;
                    i += 2;
                    continue;
                }else if(i + 1 < chars.length && chars[i + 1] == 'X'){
                    res += 9;
                    i += 2;
                    continue;
                }else{
                    res++;
                    i++;
                    continue;
                }
            }
            if(chars[i] == 'X'){
                if(i + 1 < chars.length && chars[i + 1] == 'L'){
                    res += 40;
                    i += 2;
                    continue;
                }else if(i + 1 < chars.length && chars[i + 1] == 'C'){
                    res += 90;
                    i += 2;
                    continue;
                }else{
                    res += 10;
                    i++;
                    continue;
                }
            }
            if(chars[i] == 'C'){
                if(i + 1 < chars.length && chars[i + 1] == 'D'){
                    res += 400;
                    i += 2;
                    continue;
                }else if(i + 1 < chars.length && chars[i + 1] == 'M'){
                    res += 900;
                    i += 2;
                    continue;
                }else{
                    res += 100;
                    i++;
                    continue;
                }
            }
            if(chars[i] == 'V'){
                res += 5;
                i++;
                continue;
            }
            if(chars[i] == 'L'){
                res += 50;
                i++;
                continue;
            }
            if(chars[i] == 'D'){
                res += 500;
                i++;
                continue;
            }
            if(chars[i] == 'M'){
                res +=1000;
                i++;
                continue;
            }
        }
        return res;
    }
}
