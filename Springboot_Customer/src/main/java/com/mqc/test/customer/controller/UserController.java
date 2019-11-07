package com.mqc.test.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

/**
 * @author : Ar1es
 * @date : 2019/7/30
 * @since : Java 8
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;


    @GetMapping("/get")
    public String getAll(){
        System.out.println(123);
        System.out.println(userService.findAllUser());
        return "12345";
    }
    @GetMapping("/hello")
    public String getA(){
        return "hello,world!";
    }

}
