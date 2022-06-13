package com.zhashu;

import spring.BeanPostProcessor;
import spring.Component;

@Component
public class MyBeanPostAfterProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessorAfterInitialization(Object bean, String beanName) {

        System.out.println(beanName + "：AOP前置通知...");

        return bean;
    }
}
