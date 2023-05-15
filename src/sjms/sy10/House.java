package sjms.sy10;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 20:25
 */
public abstract class House {
    protected Monitor monitor;

    public House(Monitor monitor) {
        this.monitor = monitor;
    }
    abstract void high();
}
