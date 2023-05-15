package sjms.sy9.work1;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 19:36
 */
public class Encryption implements Component{
    @Override
    public String encipher(String data) {
        return data + "加密了";
    }
}
