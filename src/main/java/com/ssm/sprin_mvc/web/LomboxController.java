package com.ssm.sprin_mvc.web;

import com.ssm.sprin_mvc.javabea.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lombox")
public class LomboxController {


    @RequestMapping("/regop")
    public ModelAndView  regop(@ModelAttribute UserInfo   userInfo){

        ModelAndView mav = new ModelAndView();

     mav.addObject("userInfo",userInfo);

        System.out.println(userInfo.getUserid());
        System.out.println(userInfo.getUsername());
        System.out.println(userInfo.getUserpass());
        System.out.println(userInfo.getUserphone());

        System.out.println(userInfo.toString());
        mav.setViewName("userinfo1");
        return mav;
    }




}
