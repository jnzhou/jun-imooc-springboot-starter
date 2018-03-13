package com.imooc.controller;
import java.util.Date;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller    //RestController=controller+ResponseBody
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUser")
    //@ResponseBody
    public static User sayHello() {
        User u = new User();
        u.setName("JunZhou");
        System.out.println(u.getName());
        return u;
    }

    //返回封装对象
    @RequestMapping("/getUserJson")
    //@ResponseBody
    public Object getUserJson() {
        User u = new User();
        u.setName("imooc");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("imooc");
        u.setDesc("hello imooc~~hello imooc~~");

        return IMoocJSONResult.ok(u);
    }
}
