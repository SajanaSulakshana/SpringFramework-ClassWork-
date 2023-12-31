package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class SpringBeanTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanTwo(){
        System.out.println("Spring Bean Two");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware SpringBeanTwo");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware SpringBeanTwo");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable SpringBeanTwo");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean SpringBeanTwo");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware SpringBeanTwo");
    }
}
