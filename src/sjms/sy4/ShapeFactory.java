package sjms.sy4;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:12
 */
public class ShapeFactory {
    public static Shape createShape(String type) throws Exception {
        if(type.toLowerCase().equals("circle")){
            return new Circle();
        }else if(type.toLowerCase().equals("rectangle")){
            return new Rectangle();
        }else if(type.toLowerCase().equals("triangle")){
            return new Triangle();
        }else{

            throw new Exception("不支持该类型");
        }

    }
}
