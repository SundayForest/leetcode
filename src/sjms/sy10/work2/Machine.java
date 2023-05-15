package sjms.sy10.work2;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 20:43
 */
public class Machine {
    Charge charge;

    public void setCharge(Charge charge) {
        this.charge = charge;
    }
    public void Charge(){
        System.out.println(charge.charge());
    }
}
