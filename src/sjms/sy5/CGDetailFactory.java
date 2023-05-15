package sjms.sy5;

/**
 * @author sunday
 * @create 2023 --- 04 --- 03 --- 11:47
 */
public class CGDetailFactory implements DetailFactory{
    @Override
    public Detail factoryMethod(String type) throws Exception {
        if(type.toLowerCase().equals("fk")){
            return new FKDetail();
        }else if(type.toLowerCase().equals("sh")){
            return new SHDetail();
        }else if(type.equals("cg")){
            return new CGDetail();
        }else{
            throw new Exception();
        }
    }
}
