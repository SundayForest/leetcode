package sjms.sy12.work2;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 22:52
 */
public class Lamp extends Equipment{
    @Override
    void open() {
        System.out.println("lamp open");
    }

    @Override
    void close() {
        System.out.println("lamp close");
    }
}
