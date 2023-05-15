package sjms.sy11.work2;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 22:16
 */
public class Manger extends Leader{
    public Manger(String name, Leader higher) {
        super(name, higher);
    }

    @Override
    void handle(Request request) {
        if(request.getDays() < 10){
            System.out.println("manger say ok");
        }else{
            higher.handle(request);
        }
    }
}
