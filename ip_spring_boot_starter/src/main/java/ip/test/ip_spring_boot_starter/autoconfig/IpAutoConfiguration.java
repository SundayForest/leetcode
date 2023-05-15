package ip.test.ip_spring_boot_starter.autoconfig;

import ip.test.ip_spring_boot_starter.config.SprintMvcConfig;
import ip.test.ip_spring_boot_starter.interceptor.IPCountInterceptor;
import ip.test.ip_spring_boot_starter.service.IpCountServer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import properties.IpProperties;

/**
 * @author sunday
 * @create 2023 --- 05 --- 13 --- 14:16
 */
@EnableScheduling
//@EnableConfigurationProperties(IpProperties.class)
@Import({IpProperties.class,SprintMvcConfig.class, IPCountInterceptor.class})
public class IpAutoConfiguration {
    @Bean
    public IpCountServer ipCountServer(){
        return new IpCountServer();
    }
}
