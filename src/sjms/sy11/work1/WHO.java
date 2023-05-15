package sjms.sy11.work1;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 21:07
 */
public class WHO extends TUN{

    public WHO() {
        super("WHO");
    }

    @Override
    void chat(String from, String to, String message) {
        Country country =  super.hashMap.get(to);
        if(country != null){
            country.GetMes(from + "->" + to + ":" + message + "  by WHO");
        }
    }
}
