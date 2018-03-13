package com.imooc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping("/hello")
    public Object sayHello(){
        System.out.println("hello,springboot~~");
        return  "hello,springboot~~";
    }
}
