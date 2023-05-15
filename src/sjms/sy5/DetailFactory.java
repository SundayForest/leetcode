package sjms.sy5;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:46
 */
public interface DetailFactory {
    Detail factoryMethod(String type) throws Exception;
}
