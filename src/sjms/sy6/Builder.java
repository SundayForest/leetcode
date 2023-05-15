package sjms.sy6;

/**
 * @author sunday
 * @create 2023 --- 04 --- 10 --- 10:33
 */
public interface Builder {
    public void buildMenu(Product product);
    public void buildPlay(Product product);
    public void buildMain(Product product);
    public void buildController(Product product);
    public Product getResult(int type);

}
