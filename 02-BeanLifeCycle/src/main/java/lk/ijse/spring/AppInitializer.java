package lk.ijse.spring;

import lk.ijse.spring.pojo.SpringBeanOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {



        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        SpringBeanOne bean = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean);

        /*Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                ctx.close();
            }
        }));*/
        ctx.registerShutdownHook();
    }
}
