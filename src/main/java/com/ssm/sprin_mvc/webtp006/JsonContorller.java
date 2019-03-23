package com.ssm.sprin_mvc.webtp006;

import com.alibaba.fastjson.JSON;
import com.ssm.sprin_mvc.javabea.UserInfo;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


/**
 *    //前台用下面的Jquery代码调用
 *            $(function(){
 *               $("#btn").click(function(){
 *                   $.post("mvc/getPerson",{name:$("#name").val()},function(data){
 *                       alert(data);
 *                   });
 *               });
 *           });
 *

 *
 */
@Controller
@RequestMapping("json")
@Log4j2//日志文件注解
public class JsonContorller {
    // private static final Logger logger= LoggerFactory.getLogger(JsonContorller.class);

    @RequestMapping("getui")
    public void getUserinfo(String name, HttpServletResponse response) throws IOException {

        UserInfo ui = new UserInfo();
        ui.setUserid(007);
        ui.setUsername("詹姆斯邦德");
        ui.setUserpass("123123");
        ui.setUserphone("12580");
        String jsonUI = JSON.toJSONString(ui);
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.print(jsonUI);
        pw.flush();
        pw.close();


    }

    /**
     *
     * @param username  查询条件1
     * @param proid 查询条件2
     * @return
     */
    @RequestMapping("getuilist")
    public  @ResponseBody List<UserInfo> getuilist(@RequestParam String username,@RequestParam String proid) {
       // logger.info("查询条件"+username+"   "+proid);
        log.info("查询条件"+username+"   "+proid);


        List<UserInfo> list = new ArrayList<UserInfo>();
        for (int i = 0; i < 15; i++) {
            UserInfo temp = new UserInfo();
            temp.setUserid(007+i);
            temp.setUsername("终结者" + i + "号");
            temp.setUserpass("123123");
            temp.setUserphone("12580");
            list.add(temp);//list add
        }

        return list;//json  JSON_API   [{一对对象}{}{}]

    }




}


