package sjms.sy4;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:15
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Shape c = ShapeFactory.createShape("circle");
        c.draw();
        c.erase();
        Shape e = ShapeFactory.createShape("rectangle");
        e.erase();
        e.draw();
        Shape t = ShapeFactory.createShape("triangle");
        t.draw();
        t.erase();
        Shape n = ShapeFactory.createShape("none");
        n.erase();
        n.draw();
    }
}
