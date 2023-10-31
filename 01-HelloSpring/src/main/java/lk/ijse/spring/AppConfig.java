package lk.ijse.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="lk.ijse.spring.pojo")
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig Created");
    }

}
