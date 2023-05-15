package sjms.sy10;

import java.util.List;
import java.util.Set;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 20:26
 */
public class Monitor {
    Set<ResponseDevice> set;

    public Monitor(Set<ResponseDevice> set) {
        this.set = set;
    }
    public void add(ResponseDevice responseDevice){
        set.add(responseDevice);
    }
    public void remove(ResponseDevice responseDevice){
        set.remove(responseDevice);
    }
    public void response() {
        for (ResponseDevice d : set) {
            d.response();
        }
    }
}
