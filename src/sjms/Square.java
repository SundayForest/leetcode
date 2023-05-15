package sjms;

/**
 * @author sunday
 * @create 2023 --- 04 --- 02 --- 22:30
 */
public class Square implements WorkOut{
    @Override
    public double Area(double h, double l) {
        System.out.println("这是正方形的解决方案");
        return  h * l;
    }

    @Override
    public double Girth(double h, double l) {
        System.out.println("这是正方形的解决方案");
        return 2 * (h  + l);
    }
}
