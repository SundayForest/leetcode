package sjms;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 10:38
 */
public class MachineGun implements AbstractGUn{
    @Override
    public void shoot() {
        System.out.println("machine gun shoot");
    }
}
