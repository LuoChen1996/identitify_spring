package com.zhashu;

import spring.Autowired;
import spring.Component;

@Component("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private OrderService orderService;

    @Override
    public void test() {
        orderService.test();
    }
}
