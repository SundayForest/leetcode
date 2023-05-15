package sjms.sy7.t2;

/**
 * @author sunday
 * @create 2023 --- 04 --- 18 --- 23:00
 */
public class File implements PrintType{
    @Override
    public void logPrint() {
        System.out.println("to file");
    }
}
