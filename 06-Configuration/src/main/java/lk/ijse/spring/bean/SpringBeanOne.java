package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    public SpringBeanOne(){
        System.out.println("Spring Bean Instantiated");
    }
}