package sjms.sy8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 04 --- 18 --- 23:25
 */
public class Folder implements Contain{
    List<TheFile> children;
    public Folder(){
        children = new ArrayList<>();
    }
    public void add(TheFile file){
        children.add(file);
    }
    @Override
    public void antivirus() {
        for(int i = 0; i < children.size(); i++){
            children.get(i).antivirus();
        }
    }
}
