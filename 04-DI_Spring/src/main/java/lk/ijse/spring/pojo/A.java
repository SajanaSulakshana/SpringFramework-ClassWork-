package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    @Autowired
    private B b;
    public A(){
        System.out.println("A");
    }


    public void sendRequest(){
        b.callMe();
    }
}
