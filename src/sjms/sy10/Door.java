package sjms.sy10;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 20:30
 */
public class Door implements ResponseDevice{
    @Override
    public void response() {
        System.out.println("door close");
    }
}
