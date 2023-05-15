package sjms.sy7;

import sjms.PropFileUtil;

/**
 * @author sunday
 * @create 2023 --- 05 --- 07 --- 23:20
 */
public class Client {
    public static void main(String[] args) throws Exception {
//        Robot robot = (Robot)iniRobot();
//        robot.run();
//        robot.say();
        DataOperation dataOperation = (DataOperation) iniDataOperation();
        int[] arr = new int[]{1,5,3,4,2};
        dataOperation.search(arr,1);
        dataOperation.Sort(arr);
    }
    public static Robot iniRobot() throws Exception{
        String fileName=".\\src\\sjms\\conf.properties";
        PropFileUtil proUtil=PropFileUtil.getInstance(fileName);
        String clsName=proUtil.getParameterValue("robot");
        Class clzz=Class.forName(clsName);
        Robot bean =(Robot) clzz.newInstance();
        return bean;
    }
    public static DataOperation iniDataOperation() throws Exception{
        String fileName=".\\src\\sjms\\conf.properties";
        PropFileUtil proUtil=PropFileUtil.getInstance(fileName);
        String clsName=proUtil.getParameterValue("dataoperation");
        Class clzz=Class.forName(clsName);
        DataOperation bean =(DataOperation) clzz.newInstance();
        return bean;
    }
}
