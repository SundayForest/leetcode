package sjms.sy11.work1;

import java.util.HashMap;
import java.util.Set;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 20:55
 */
public class Country {
    public String name;
    private HashMap<String,TUN> TUNs;
    public void addInstitution(TUN tun){
        TUNs.put(tun.name,tun);
    }
    public void chat(String message,String to,String type){
        TUN t = TUNs.get(type);
        t.chat(name,to,message);
    }
    public void GetMes(String message){
        System.out.println(message);
    }
}
