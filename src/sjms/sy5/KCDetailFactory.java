package sjms.sy5;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:48
 */
public class KCDetailFactory implements DetailFactory{
    @Override
    public Detail factoryMethod(String type) {
        return new KCDetail();
    }
}
