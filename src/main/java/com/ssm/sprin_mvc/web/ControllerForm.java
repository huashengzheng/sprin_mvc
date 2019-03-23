package com.ssm.sprin_mvc.web;

import com.ssm.sprin_mvc.javabea.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/ui")
public class ControllerForm {
    @RequestMapping("/reg")
    public ModelAndView  reg(@RequestParam  Integer  userid,@RequestParam String  username,@RequestParam  String  userpass,@RequestParam String userphone){

        ModelAndView mav = new ModelAndView();


        //传值给前台的${****}
//        mav.addObject("userid",userid);
//        mav.addObject("username",username);
//        mav.addObject("userpass",userpass);
//        mav.addObject("userphone",userphone);

        System.out.println(username);
        System.out.println(userphone);
        mav.setViewName("userinfo");
        return mav;
    }

    @RequestMapping("/regop")
    public ModelAndView  regop(@ModelAttribute UserInfo   userInfo){

        ModelAndView mav = new ModelAndView();

       mav.addObject("userInfo",userInfo);

        System.out.println(userInfo.toString());
        mav.setViewName("userinfo");
        return mav;
    }




}
