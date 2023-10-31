package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements  BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanOne(){
        System.out.println("Spring Bean One");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware Spring Bean");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware Spring Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Spring Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean Spring Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware Spring Bean");
    }
}
