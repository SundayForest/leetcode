package sjms.sy10.work2;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 20:44
 */
public class Discount implements Charge{
    @Override
    public String charge() {
        return "discount ...";
    }
}
