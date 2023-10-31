package lk.ijse.spring;

import lk.ijse.spring.bean.A;
import lk.ijse.spring.bean.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    @Bean
    public A a(){
        return new A();
    }
    @Bean
    public B b(){
        return new B();
    }
}
