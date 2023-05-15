package sjms.sy7.t2;

/**
 * @author sunday
 * @create 2023 --- 04 --- 18 --- 23:01
 */
public class Console implements PrintType{
    @Override
    public void logPrint() {
        System.out.println("to console");
    }
}
