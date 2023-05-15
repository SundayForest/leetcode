package ip.test.ip_spring_boot_starter.config;


import ip.test.ip_spring_boot_starter.interceptor.IPCountInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author sunday
 * @create 2023 --- 05 --- 13 --- 15:56
 */
@Configuration
public class SprintMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(ipCountInterceptor()).addPathPatterns("/**");
    }
    @Bean
    public IPCountInterceptor ipCountInterceptor(){
        return new IPCountInterceptor();
    }
}
