package sjms.sy11.work1;

import java.util.HashMap;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 20:56
 */
public abstract class TUN {
    protected HashMap<String,Country> hashMap;
    public String name;
    public TUN(String name) {
        this.name = name;
        hashMap = new HashMap<>();
    }

    public void register(Country country){
        hashMap.put(country.name,country);
    }
    abstract void chat(String from,String to,String message);
}
