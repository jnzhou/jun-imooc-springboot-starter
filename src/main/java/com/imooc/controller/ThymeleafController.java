package com.imooc.controller;

import com.imooc.pojo.Resource;
import com.imooc.pojo.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //@RestController 返回了String内容。
@RequestMapping("th")
public class ThymeleafController {

    //这里把resource.properties内容注入进来
    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String getResource(ModelMap map) {
        map.addAttribute("name", resource.getName());
        map.addAttribute("website", resource.getWebsite());
        map.addAttribute("language", resource.getLanguage());
        return "thymeleaf/index";
    }

    @RequestMapping("/test")
    public String getResource() {
        return "thymeleaf/test/demo";
    }

    @RequestMapping("thw")
    public String getThwdemo(ModelMap map) {
        User u = new User();
        u.setName("superadmin");
        u.setAge(10);
        u.setPassword("123465");
        u.setBirthday(new Date());
        u.setDesc("<font color='green'><b>hello imooc</b></font>");

        map.addAttribute("user", u);

        User u1 = new User();
        u1.setAge(19);
        u1.setName("imooc");
        u1.setPassword("123456");
        u1.setBirthday(new Date());

        User u2 = new User();
        u2.setAge(17);
        u2.setName("Jun");
        u2.setPassword("123456");
        u2.setBirthday(new Date());

        List<User> userList = new ArrayList<>();
        userList.add(u);
        userList.add(u1);
        userList.add(u2);

        map.addAttribute("userList", userList);

        return "thymeleaf/thwdemo";
    }

    @RequestMapping("postform")
    public String postAction(User user) {
        System.out.println(user.getName());
        return "thymeleaf/thwdemo";
    }
}
