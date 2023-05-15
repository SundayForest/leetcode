package sjms.sy6;

/**
 * @author sunday
 * @create 2023 --- 04 --- 10 --- 10:37
 */
public class BuilderImp implements Builder
{
    @Override
    public void buildMenu(Product product) {
        product.assembly.add("菜单");
    }

    @Override
    public void buildPlay(Product product) {
        product.assembly.add("播放列表");
    }

    @Override
    public void buildMain(Product product) {
        product.assembly.add("主窗口");
    }

    @Override
    public void buildController(Product product) {
        product.assembly.add("控制条");
    }

    @Override
    public Product getResult(int type) {
        Product product = new Product();
        if(type > 0){
            buildController(product);
            buildMain(product);
        }
        if(type > 1){
            buildPlay(product);
            buildMenu(product);
        }
        return  product;
    }
}
