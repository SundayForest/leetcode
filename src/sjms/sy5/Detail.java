package sjms.sy5;


import java.time.LocalDateTime;
import java.util.Collection;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:42
 */
public class Detail {
    private String dh;
    private LocalDateTime date;
    private String maker;
    private String sm;
    private Collection drdj;
    private Collection dj;
    public void add(){
        System.out.println("add");
    }
    public void delete(){
        System.out.println("delete");
    }
    public void addDetail(){
        System.out.println("add detail");
    }
    public void deleteDetail(){
        System.out.println("delete detail");
    }
    public void print(){
        System.out.println("print");
    }
    public boolean check(){
        return true;
    }
}
