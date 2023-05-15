package sjms.sy4;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:10
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle draw");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle erase");
    }
}
