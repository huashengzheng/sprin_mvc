package com.ssm.sprin_mvc.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class GetPostController {
    @RequestMapping("one")
    public String one() {
        System.out.println("你好SpringMvc");
        return "one";
    }

    // 在实际的开发过程中method=RequestMethod.POST  一般需要配置上
    @RequestMapping(value = "two", method = RequestMethod.POST)
    public ModelAndView two() {
        System.out.println("two   post提交");
        ModelAndView two = new ModelAndView("two");
        two.addObject("username","詹姆士邦德");
        two.addObject("id","007");
        return two;
    }

    @RequestMapping(value = "three")
    public ModelAndView three() {
        System.out.println("three  get and post 都可以访问 ");

        ModelAndView modelAndView = new ModelAndView();
        return new ModelAndView("three");

    }
}
