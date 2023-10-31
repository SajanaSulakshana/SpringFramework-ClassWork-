package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component*/
public class SpringBean2 implements InitializingBean{
    @Value("C001")
    private String id;
    @Value("Sajana")
    private String name;
    @Value("Horana")
    private String address;
    @Value("500000")
    private double salary;

    public SpringBean2(){
        System.out.println("Spring Bean 2 Constructor");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(salary);
    }
}
