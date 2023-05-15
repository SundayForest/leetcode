package sjms.sy6;

/**
 * @author sunday
 * @create 2023 --- 04 --- 10 --- 10:33
 */
public class Client {
    public static void main(String[] args) throws Exception {
        DataCollection d1 = new DataCollection(1,"red");
        DataCollection d2 = (DataCollection) d1.Clone();
        DataCollection d3 = (DataCollection) d1.deepClone();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d1.getData() == d2.getData());
        System.out.println(d1.getData() == d3.getData());
    }
}
