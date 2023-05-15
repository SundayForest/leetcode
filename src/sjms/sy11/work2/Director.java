package sjms.sy11.work2;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 22:14
 */
public class Director extends Leader{

    public Director(String name, Leader higher) {
        super(name, higher);
    }

    @Override
    void handle(Request request) {
        if (request.getDays() < 3){
            System.out.println("director say ok");
        }
        else {
            higher.handle(request);
        }
    }
}
