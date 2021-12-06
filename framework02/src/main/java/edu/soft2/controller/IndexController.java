package edu.soft2.controller;

import org.apache.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    //1.接收处理数据
    //2.调用业务逻辑(n/a)
    //3.页面跳转
    @RequestMapping(value = "/sayHello")//方法的url访问地址
    public String sayHello(){
        System.out.println("hello springmvc!");
        //url:/WEB-INF/pages/XXX.jsp
        return "success";//页面跳转(与视图解析器拼接出url)
    }
    @RequestMapping("/sayHi")
    public String sayHi(){
        System.out.println("----sayHi()----");
        return "Hi";
    }
}
