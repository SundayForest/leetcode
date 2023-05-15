package sjms.sy7.t2;

/**
 * @author sunday
 * @create 2023 --- 04 --- 18 --- 23:10
 */
public class WindowSys extends TheSystem{
    public WindowSys(Language language,PrintType printType){
        this.language = language;
        this.PRINT_TYPE = printType;
    }
    @Override
    public void log(){
        language.logLan();
        PRINT_TYPE.logPrint();
        System.out.println("in windows");
    }

}
