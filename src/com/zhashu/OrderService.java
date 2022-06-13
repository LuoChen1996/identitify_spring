package com.zhashu;

import spring.Component;

@Component
public class OrderService implements UserService {

    @Override
    public void test() {
        System.out.println("I am OrderService");
    }
}
