package ip.test.ip_spring_boot_starter.interceptor;

import ip.test.ip_spring_boot_starter.service.IpCountServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sunday
 * @create 2023 --- 05 --- 13 --- 15:55
 */
public class IPCountInterceptor implements HandlerInterceptor {
    @Autowired
    private IpCountServer ipCountServer;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        ipCountServer.count();
        return true;
    }
}
