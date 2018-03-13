package com.imooc.controller;

import com.imooc.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //@RestController 返回了String内容。
@RequestMapping("ftl")
public class FreemarkerController {

    //这里把resource.properties内容注入进来
    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String getResource(ModelMap map){
        map.addAttribute("resource", resource);
        return "freemarker/index";
    }

    @RequestMapping("/center")
    public String getResource(){
        return "freemarker/center/center";
    }
}
