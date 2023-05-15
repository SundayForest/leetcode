package sjms.sy3;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:03
 */
public class BenTian implements Car{
    @Override
    public void drive() {
        System.out.print("本田 正在");
        autoDriveSys.autoDrive();
    }
}
