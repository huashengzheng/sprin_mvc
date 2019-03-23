package com.ssm.sprin_mvc.webtp007;


import com.ssm.sprin_mvc.biz.UserInfoPoBiz;
import com.ssm.sprin_mvc.javabea.UserInfoPo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("userinfo")
@Log4j2

public class UserInfoController {

@Autowired 
    UserInfoPoBiz  userInfoPoBiz;
    public UserInfoController() {
        log.info("【构造方法】：UserInfoController()");
    }
   @RequestMapping("/reg")
    public ModelAndView reg(@ModelAttribute UserInfoPo  infoPo){

        ModelAndView modelAndView = new ModelAndView();
        log.info("注册信息--infoOP:"+infoPo.toString());

       UserInfoPo info = userInfoPoBiz.seave(infoPo);
       modelAndView.addObject("info",info);
       modelAndView.setViewName("index");
       return modelAndView;
   }

   @RequestMapping("list")
    public  ModelAndView list(){

        ModelAndView  modelAndView = new ModelAndView();
       List<UserInfoPo> search = userInfoPoBiz.search();
       modelAndView.addObject("search",search);
       modelAndView.setViewName("index");
       return  modelAndView;
   }




}
