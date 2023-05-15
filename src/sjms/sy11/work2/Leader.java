package sjms.sy11.work2;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 22:11
 */
public abstract class Leader {

    protected String name;
    protected Leader higher;

    public Leader(String name, Leader higher) {
        this.name = name;
        this.higher = higher;
    }

    abstract void handle(Request request);
}
