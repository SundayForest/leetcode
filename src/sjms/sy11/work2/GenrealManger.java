package sjms.sy11.work2;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 22:17
 */
public class GenrealManger extends Leader{

    public GenrealManger(String name, Leader higher) {
        super(name, higher);
    }

    @Override
    void handle(Request request) {
        if(request.getDays() < 30){
            System.out.println("general manger say ok");
        }else{
            System.out.println("failed ...");
        }
    }
}
