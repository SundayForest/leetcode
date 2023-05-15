package sjms.sy5;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:47
 */
public class XSDetailFactory implements DetailFactory{
    @Override
    public Detail factoryMethod(String type) {
        return new XXDetail();
    }
}
