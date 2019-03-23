package com.ssm.sprin_mvc.webtp003;

import com.alibaba.fastjson.JSON;
import com.ssm.sprin_mvc.javabea.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("action")
public class Forward_RedirectController {

	public Forward_RedirectController() {

		System.out.println(" Forward_RedirectController()  spring is ok.............................  ");
	}

	// 案例一
	@RequestMapping("demo01")
	public String demo01() {

		return "jsp/demo01"; // jsp/demo01.jsp
	}

	// 案例二
	@RequestMapping("demo02")
	public String demo02() {

		return "forward:/jsp/demo02.jsp"; // jsp/demo02.jsp
	}

	// 案例三
	@RequestMapping("demo03")
	public String demo03() {

		return "redirect:/jsp/demo03.jsp"; // jsp/demo03.jsp
	}

	// 案例四
	@RequestMapping("demo04")
	public String demo04() {

		System.out.println("跳到index.jsp");
		return "redirect:/index.jsp"; //
	}

	// 案例五
	@RequestMapping("demo05")
	public ModelAndView demo05() {

		//return "redirect:/index.jsp"; //
		//../ 类上的requestMapping
		return  new ModelAndView(new RedirectView("../jsp/demo05.jsp"));
		
	}
	
	// 案例六
	@RequestMapping("demo06")
	public ModelAndView demo06() {

		////return new ModelAndView(new RedirectView("../demo/three.html"));//  ui/test8.html
		// ../  返回url 
		//WEB-INF 下的页面不能直接打开，要通过springmvc跳转 页面   WEB-INF的资源不能被下载
		
		return  new ModelAndView(new RedirectView("../red/demo06.jsp"));
		
	}
	
	// 案例七 ?userid="+userid
	@RequestMapping("demo07")
	public ModelAndView demo07(@RequestParam Integer  userid) {

		
		System.out.println(userid);


         //带参
		////return new ModelAndView("redirect:/jsp/three.jsp?a="+1007);
		return  new ModelAndView(new RedirectView("../jsp/demo07.jsp?userid="+userid));
		
	}
	
	@RequestMapping("demo08")
	@ResponseBody //不返回页面内容
	public void json(){
		
	 	System.out.println(" 没有返回视图 ");
		
	}
	
	
	@RequestMapping("demo09")
	@ResponseBody //不返回页面内容     jq ajax
	public void jsonbody(HttpServletResponse  response) throws IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pw = response.getWriter();
		UserInfo ui=new UserInfo();
		ui.setUserid(007);
		ui.setUsername("詹姆斯邦德");
		ui.setUserpass("123123");
		ui.setUserphone("12580");

		List<UserInfo> list=new ArrayList<UserInfo>();
		for (int i = 0; i <3 ; i++) {
			UserInfo temp=new UserInfo();
			temp.setUserid(007+i);
			temp.setUsername("詹姆斯邦德"+i);
			temp.setUserpass("123123"+i);
			temp.setUserphone("12580"+i);
			list.add(temp);
		}

		String jsonString = JSON.toJSONString(ui);

		pw.println(" hello  json  js:alert");
		System.out.println(list);
		pw.println(jsonString);
		pw.println(JSON.toJSONString(list));//把一个对象变成字符串


		pw.flush();
		pw.close();
		
		
		
	}

	@RequestMapping("gg")
	@ResponseBody
	public UserInfo get() {
		UserInfo ui = new UserInfo(1007, "思贤", "123123", "123123");

		return ui;
	}
	
	
	
	
	

}
