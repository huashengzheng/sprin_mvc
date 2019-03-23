package com.ssm.sprin_mvc.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringMvc {
    public HelloSpringMvc() {


        System.out.println("--------------------------------");
    }

    @RequestMapping("hello")
    public  String  hello(){

        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("你好SpringMvc");
        return "hello";
    }
    @RequestMapping("back")
    public  String  back(){

        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("我要去back");
        return "back";
    }
}
