package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class B {
    public B(){
        System.out.println("B");
    }
    public void callMe(){
        System.out.println("CAll Me");
    }
}
