package com.ssm.sprin_mvc.webtp004;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping(value = "/rest")
public class RestControlller {


    public RestControlller() {

        System.out.println("        RestController()   spring is  ok~~~~~~~~~~~~~~~~~~~~~~~~             ");

    }

    @RequestMapping(value = "/{a}/show001") //       rest/a/show001.do
    public ModelAndView show001(@PathVariable(value = "a") String a) {

        ModelAndView m = new ModelAndView("rest");

        m.addObject("a", a);

        return m;
    }

    @RequestMapping(value = "/{a}/{b}/show002") //rest/a/b/show002.do
    public ModelAndView show002(@PathVariable(value = "a") String a,@PathVariable("b") String  userid) {

        ModelAndView m = new ModelAndView("rest");

        m.addObject("a", a);
        m.addObject("userid",userid);


        return m;
    }


    @RequestMapping(value = "/{a}/{b}/show003/{c}")//rest/a/b/show003/c.do
    public ModelAndView show003(@PathVariable(value = "a") String a,@PathVariable("b") String  userid,@PathVariable("c") String  c) {

        ModelAndView m = new ModelAndView("rest");

        m.addObject("a", a);
        m.addObject("userid",userid);
        m.addObject("c",c);


        return m;
    }


    /**
     * 把url的路径变为参数
     *  userid=007   转rest :  baidu/007/
     * @param a  userid=007   /007/008/009
     * @param b
     * @param c
     * @return
     */

    @RequestMapping(value = "/{a}/{b}/{c}/rest04", method = RequestMethod.GET)
    public ModelAndView rest04(@PathVariable(value = "a") String a,
                               @PathVariable(value = "b") String b,
                               @PathVariable(value = "c") String c) {

        ModelAndView ma = new ModelAndView("rest");// reqesut.setA...(k,v)

        Map m=new HashMap();
        m.put("a", a);
        m.put("b", b);
        m.put("c", c);

        ma.addAllObjects(m);

        //ma.addObject(attributeName, attributeValue)



        return ma;

    }


}
