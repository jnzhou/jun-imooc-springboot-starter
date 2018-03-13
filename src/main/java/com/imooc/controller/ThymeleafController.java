package com.imooc.controller;

import com.imooc.pojo.Resource;
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
    public String getResource(ModelMap map){
        map.addAttribute("name", resource.getName());
        map.addAttribute("website", resource.getWebsite());
        map.addAttribute("language", resource.getLanguage());
        return "thymeleaf/index";
    }

    @RequestMapping("/test")
    public String getResource(){
        return "thymeleaf/test/demo";
    }
}
