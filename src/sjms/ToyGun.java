package sjms;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 10:38
 */
public class ToyGun implements AbstractToy{
    @Override
    public void shoot() {
        System.out.println("toy gun shoot");
    }
}
