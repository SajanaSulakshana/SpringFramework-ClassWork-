package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean(){
        System.out.println("Spring Bean Created");
    }

    public void test(){
        System.out.println("Test Created");
    }
}
