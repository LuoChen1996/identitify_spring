package com.zhashu;

import spring.Component;
import spring.InitializingBean;

@Component
public class MyInitializingBean implements InitializingBean {

    @Override
    public void afterProperties() {
        System.out.println("MyInitializingBean ---> afterProperties");
    }
}
