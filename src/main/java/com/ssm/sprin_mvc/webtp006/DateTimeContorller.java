package com.ssm.sprin_mvc.webtp006;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;



@Controller
@RequestMapping("get")
@SessionAttributes({"date","username"})
public class DateTimeContorller {
	
	
	
    @RequestMapping("/date")//import java.util.Date;
    public String date(@RequestParam(value="date") Date date, Model m,Map<String,Object>  map){
        System.out.println(date);
        
        
       m.addAttribute("date", date);
      
       map.put("username", "张萌萌");
        
        return "redirect:../index.jsp";
    }
    
    //At the time of initialization,convert the type "String" to type "date"
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"), true));
       // binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd "), true));
    }
	
	
	
	

}
