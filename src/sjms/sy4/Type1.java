package sjms.sy4;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:22
 */
public class Type1 implements JiSuanQi{
    @Override
    public int add(int a, int b) {
        System.out.println("type1 is running");
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("type1 is running");
        return a - b;
    }
}
