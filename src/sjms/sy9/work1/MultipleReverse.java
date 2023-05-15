package sjms.sy9.work1;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 19:57
 */
public class MultipleReverse extends Decorator{
    public MultipleReverse(Component component) {
        super(component);
    }
    public String encrypt(String data){
        return  reverse(data);
    }
    public String reverse(String data){
        StringBuilder sb = new StringBuilder();
        sb.append(super.encipher(data));
        return sb.reverse().toString();
    }
}
