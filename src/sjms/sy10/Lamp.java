package sjms.sy10;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 20:30
 */
public class Lamp implements ResponseDevice{
    @Override
    public void response() {
        System.out.println("lamp --> red");
    }
}
