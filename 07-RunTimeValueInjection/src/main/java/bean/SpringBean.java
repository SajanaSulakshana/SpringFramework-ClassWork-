package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component*/
public class SpringBean {
    /*public SpringBean(@Value("C001") String id,@Value("20") int age,@Value("true") boolean b){
        System.out.println("Spring Bean Instantiated");
        System.out.println(id);
        System.out.println(age);
        System.out.println(b);
    }*/
    @Autowired(required = false)
    public SpringBean(@Value("Sajana,Sajee,Hashini") String[] myName){
        for (String myNames: myName) {
            System.out.println(myNames);
        }
    }
   @Autowired(required = false)
    public SpringBean(@Value("1,2,3") int[] myNumber){
        for (int myNumbers: myNumber) {
            System.out.println(myNumbers);
        }
    }

}
