package sjms.sy8.w2;

/**
 * @author sunday
 * @create 2023 --- 04 --- 18 --- 23:44
 */
public class Proxy implements Abstractlogin{
    User user;

    public Proxy(User user) {
        this.user = user;
    }

    @Override
    public void login() {
        user.login();
        System.out.println("log");
    }
}
