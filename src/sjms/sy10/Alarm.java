package sjms.sy10;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 20:31
 */
public class Alarm implements ResponseDevice{
    @Override
    public void response() {
        System.out.println("alarm is biu biu biu");
    }
}
