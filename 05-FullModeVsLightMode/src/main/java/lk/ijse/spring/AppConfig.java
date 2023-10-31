package lk.ijse.spring;

import lk.ijse.spring.pojo.SpringBeanThree;
import lk.ijse.spring.pojo.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")

public class AppConfig {
@Bean
    public SpringBeanTwo beanTwo(){
    SpringBeanThree b1=beanThree();
    SpringBeanThree b2=beanThree();
    System.out.println(b1);
    System.out.println(b2);
        return new SpringBeanTwo();
    }
    @Bean
    public SpringBeanThree beanThree(){
        return new SpringBeanThree();
    }
}
