package sjms.sy7.t2;

/**
 * @author sunday
 * @create 2023 --- 04 --- 18 --- 23:02
 */
public class LinuxSys extends TheSystem{
    public LinuxSys(Language language,PrintType printType){
        this.language = language;
        this.PRINT_TYPE = printType;
    }
    @Override
    public void log(){
        language.logLan();
        PRINT_TYPE.logPrint();
        System.out.println("in linux");
    }
}
