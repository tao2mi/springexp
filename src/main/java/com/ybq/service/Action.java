package com.ybq.service;

import com.ybq.aware.MyBeanPostProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Action implements BeanNameAware, BeanFactoryAware, InitializingBean {

    public String name;

    public String myName;

    public BeanFactory beanFactory;

    public void setName(String name) {
        this.name = name;
    }

    Logger logger = LoggerFactory.getLogger(Action.class);


    public String saySome(String some) {
        return "this is " + some + ", " + name;
    }

    @PostConstruct
    public void postConstruct() {
        logger.debug("Action postConstruct:" + name);
    }

    @PreDestroy
    public void preDestroy() {
        logger.debug("Action preDestroy:" + name);
    }

    @Override
    public void setBeanName(String name) {
        myName = name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【InitializingBean接口】调用afterPropertiesSet方法");
    }
}
