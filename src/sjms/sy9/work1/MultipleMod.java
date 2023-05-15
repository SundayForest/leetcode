package sjms.sy9.work1;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 19:38
 */
public class MultipleMod extends Decorator{
    public MultipleMod(Component component) {
        super(component);
    }

    public String encrypt(String data){
        return  mod(data);
    }
    private String mod(String data){
        byte[] bytes =  super.encipher(data).getBytes();
        for (byte b : bytes) {
            b %= 10;
        }
        return bytes.toString();
    }
}
