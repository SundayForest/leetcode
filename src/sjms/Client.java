package sjms;

/**
 * @author sunday
 * @create 2023 --- 04 --- 02 --- 22:27
 */
public class Client {
    Soldier soldier;
    public Client(Soldier soldier){
        this.soldier = soldier;
    }
    public static void main(String[] args) throws Exception {
        Soldier soldier = new Soldier();
        AbstractGUn gun = iniGun();
        Client client=new Client(soldier);
        soldier.KillEnemy(gun);
    }

        public static AbstractGUn iniGun() throws Exception{
            String fileName=".\\src\\work\\conf.properties";
            PropFileUtil proUtil=PropFileUtil.getInstance(fileName);
            String clsName=proUtil.getParameterValue("gun");
            Class clzz=Class.forName(clsName);
            AbstractGUn gun =(AbstractGUn) clzz.newInstance();
            return gun;
        }
}
