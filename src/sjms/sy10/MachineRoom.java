package sjms.sy10;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 20:34
 */
public class MachineRoom extends House{
    public MachineRoom(Monitor monitor) {
        super(monitor);
    }

    @Override
    void high() {
        super.monitor.response();
    }
}
