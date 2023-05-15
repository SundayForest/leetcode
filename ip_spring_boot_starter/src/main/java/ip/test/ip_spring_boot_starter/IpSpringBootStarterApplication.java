package ip.test.ip_spring_boot_starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import properties.IpProperties;

@SpringBootApplication

public class IpSpringBootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(IpSpringBootStarterApplication.class, args);
    }

}
