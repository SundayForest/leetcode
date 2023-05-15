package look.中级提升;

/**
 * @author sunday
 * @create 2023 --- 02 --- 18 --- 14:36
 */
public class Decompress_String {
//    给一个压缩字符串，返回 该字符串的原字符串
//    如 3{f2{a}}   => faafaafaa
    public String decompress(String decompressStr){
        char[] chs = decompressStr.toCharArray();
        return process(chs,0).str;
    }
    public class Result{
        String str;
        int index;
        public Result(String str,int index){
            this.str = str;
            this.index = index;
        }
    }
    public Result process(char[] chars,int index){
        StringBuilder stringBuilder = new StringBuilder();
        int times = 0;
        while (index < chars.length && chars[index] != '}'){
            if(chars[index] == '{'){
                Result result = process(chars,index + 1);
                stringBuilder.append(getTimesStr(times,result.str));
                times = 0;
                index = result.index + 1;
            }else{
                if(chars[index] >= '0' && chars[index] <= '9'){
                    times = times * 10 + chars[index] - '0';
                }
                if(chars[index] >= 'a' && chars[index] <= 'z'){
                    stringBuilder.append(String.valueOf(chars[index]));
                }
                index++;
            }
        }
        return new Result(stringBuilder.toString(),index);
    }
    public String getTimesStr(int times,String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < times; i++){
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
