package sjms.sy3;

import sjms.PropFileUtil;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:04
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Car car = iniCar();
        car.drive();
    }
    public static Car iniCar() throws Exception{
        String fileName=".\\src\\work\\conf.properties";
        PropFileUtil proUtil=PropFileUtil.getInstance(fileName);
        String clsName=proUtil.getParameterValue("car");
        Class clzz=Class.forName(clsName);
        Car car =(Car) clzz.newInstance();
        return car;
    }
}
