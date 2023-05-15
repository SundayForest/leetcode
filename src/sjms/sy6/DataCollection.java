package sjms.sy6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 04 --- 10 --- 11:07
 */
public class DataCollection implements Cloneable, Serializable {
    private List<Integer> data;
    private long id;
    private String color;
    public DataCollection(long id,String color){
        this.id = id;
        this.color = color;
        this.data = new ArrayList<>();
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Object Clone(){
        DataCollection clone = null;
        try {
            clone = (DataCollection) super.clone();
        }catch (Exception e){
            System.out.println("Clone failed");
        }
        return clone;
    }
    public Object deepClone() throws Exception {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return(ois.readObject());
    }
}
