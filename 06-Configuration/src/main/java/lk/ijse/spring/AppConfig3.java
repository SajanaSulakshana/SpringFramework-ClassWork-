package lk.ijse.spring;

import lk.ijse.spring.bean.A;
import lk.ijse.spring.bean.C;
import lk.ijse.spring.bean.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig3 {
    @Bean
    public C c(){
        return new C();
    }

    @Bean
    public D d(){
        return new D();
    }
}
