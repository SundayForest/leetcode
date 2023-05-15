package sjms.sy12.work2;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 22:51
 */
public class Switch {
    private Equipment fan;
    private Equipment lamp;

    public Switch(Equipment fan, Equipment lamp) {
        this.fan = fan;
        this.lamp = lamp;
    }
    public void openFan(){
        fan.open();
    }
    public void closeFan(){
        fan.close();
    }
    public void openLamp(){
        lamp.open();
    }
    public void closeLamp(){
        lamp.close();
    }
}
