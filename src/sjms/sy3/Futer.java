package sjms.sy3;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:03
 */
public class Futer implements Car{
    @Override
    public void drive() {
        System.out.print("福特 正在");
        autoDriveSys.autoDrive();
    }
}
