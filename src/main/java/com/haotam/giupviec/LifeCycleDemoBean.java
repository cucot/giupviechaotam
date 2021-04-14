package com.haotam.giupviec;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component // mark this a component so that Spring application bootstrap will instantiate 1 object of this type
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("Life cycle constructor has been called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean has been set to name: " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean is about to be destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("#### Bean properties has been set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("#### Bean factory has been set to " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("###Set application context has been called");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("###Post construct bean method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("###Pre destroy bean method has been called");
    }

    public void beforeInit() {
        System.out.println("####Before init bean has been called");
    }

    public void afterInit() {
        System.out.println("####After init bean has been called");
    }
}
