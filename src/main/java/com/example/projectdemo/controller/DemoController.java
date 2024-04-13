package com.example.projectdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Date：2024/4/13 19:00
 * @Description
 */
@Controller
public class DemoController {

    @RequestMapping("/one")
    @ResponseBody
    public String demo() {
        System.out.println("执行one控制器");
        return "one";
    }

    @RequestMapping("/demo/one")
    @ResponseBody
    public String demo2() {
        System.out.println("执行demo-one控制器");
        return "demo-one";
    }
}
