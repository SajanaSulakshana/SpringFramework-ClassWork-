package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean(){
        System.out.println("Spring Bean Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean Initializing");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean Application");
    }
}
