package lk.ijse.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfig2.class,AppConfig3.class})
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {
}
