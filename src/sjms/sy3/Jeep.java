package sjms.sy3;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:02
 */
public class Jeep implements Car{
    @Override
    public void drive() {
        System.out.print("Jeep 正在");
        autoDriveSys.autoDrive();
    }
}
