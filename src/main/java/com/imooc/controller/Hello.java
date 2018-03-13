package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.beancontext.BeanContext;

@RestController
public class Hello {

    //这里把resource.properties内容注入进来
    @Autowired
    Resource resource;

    @RequestMapping("/hello")
    public Object sayHello(){
        System.out.println("hello,springboot~~");
        return  "hello,springboot~~";
    }

    @RequestMapping("/getResource")
    public IMoocJSONResult getResource(){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);
        return IMoocJSONResult.ok(bean);
    }

}
