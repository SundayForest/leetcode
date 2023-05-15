package sjms.sy4;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:09
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("circle draw");
    }

    @Override
    public void erase() {
        System.out.println("circle erase");
    }
}
