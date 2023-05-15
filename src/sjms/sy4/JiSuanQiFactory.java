package sjms.sy4;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:20
 */
public class JiSuanQiFactory {
    public static JiSuanQi createJSQ(String type) throws Exception {
        if(type.toLowerCase().equals("type1")){
            return new Type1();
        }else if(type.toLowerCase().equals("type2")){
            return new Type2();
        }else{
            throw new Exception("none");
        }
    }
}
