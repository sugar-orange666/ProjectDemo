package com.example.projectdemo.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
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
    public String demo2(String name, Integer age) {
        //@RequestHeader(required = false)
        System.out.println("执行demo-one控制器");
        System.out.println("name:"+name+",age:"+age);
        return "demo-one";
    }



    @RequestMapping("/demo/three")
    @ResponseBody
    public String demo3(String name, Integer age, HttpServletResponse response) {
        //@RequestHeader(required = false)
        System.out.println("执行demo-three控制器");
        System.out.println("name:"+name+",age:"+age);
        response.setHeader("demo","test");
        return "demo-three";
    }


}
