package sjms.sy9.work1;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 19:37
 */
public class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }
    public String encipher(String data){
        return component.encipher(data);
    }
}
