package sjms.sy12.work2;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 22:52
 */
public class Fan extends Equipment{
    @Override
    void open() {
        System.out.println("open fan");
    }

    @Override
    void close() {
        System.out.println("close fan");
    }
}
