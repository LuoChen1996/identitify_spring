package com.zhashu;

import spring.AnnotationApplicationContext;

/**
 * @Author ZhaShu
 * @Date 2022-06-10 20:41
 */
public class Test {

    public static void main(String[] args) {

        AnnotationApplicationContext applicationContext = new AnnotationApplicationContext(AppConfig.class);

        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.test();

    }

}
