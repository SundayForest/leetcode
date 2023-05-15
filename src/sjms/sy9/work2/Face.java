package sjms.sy9.work2;

/**
 * @author sunday
 * @create 2023 --- 05 --- 10 --- 20:09
 */
public class Face {
    private Encryption encryption;
    private FileReader fileReader;
    private FileWrite fileWrite;
    public String operate(String path){
        return  fileWrite.write(path,encryption.encryption(fileReader.read(path)));
    }
}
