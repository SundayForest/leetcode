package sjms.sy12.work1;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 22:43
 */
public class Controller {
    private AbstractCommand add;
    private AbstractCommand delete;
    private AbstractCommand look;

    public Controller(AbstractCommand add, AbstractCommand delete, AbstractCommand look) {
        this.add = add;
        this.delete = delete;
        this.look = look;
    }
    public void add(){
        add.execute();
    }
    public void delete(){
        delete.execute();
    }
    public void look(){
        look.execute();
    }
}
