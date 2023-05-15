package sjms.sy4;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:11
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle draw");
    }

    @Override
    public void erase() {
        System.out.println("Triangle erase");
    }
}
