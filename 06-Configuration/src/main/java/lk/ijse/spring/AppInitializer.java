package lk.ijse.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        /*context.register(AppConfig2.class);
        context.register(AppConfig3.class);*/
        context.refresh();
        context.registerShutdownHook();
    }
}
