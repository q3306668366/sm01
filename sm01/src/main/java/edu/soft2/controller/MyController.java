package edu.soft2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "param1")
public class MyController {
    @RequestMapping(value = "/hello.do")
    public String hello(HttpServletRequest request) {
        //接受处理，调用业务，跳转页面
        //接收数据
        String name = request.getParameter("name");//通过参数名(url),获取参数值
        System.out.println("name=" + name);//通过参数名(url),获取参数值
        System.out.println("------hello()------");
        return "hello";
        //拼接URL：前缀+hello+后缀
    }

    @RequestMapping(value = "/param1", method = {RequestMethod.GET, RequestMethod.POST})
    public String param1(HttpServletRequest request) {
        System.out.println("------param1()------");
        //接受处理，调用业务，跳转页面
        //接收数据
        String username = request.getParameter("username");//通过参数名(url),获取参数值
        String age = request.getParameter("age");//通过参数名(url),获取参数值
        System.out.println("username=" + username + "age=" + age);
        request.setAttribute("username", username);
        request.setAttribute("age", age);
        return "hello";
        //拼接URL：前缀+hello+后缀
    }

    @RequestMapping(value = "/param2.do")
    public String param2(HttpServletRequest request) {
        System.out.println("------param2()------");
        //接受处理，调用业务，跳转页面
        //接收数据
        String username = request.getParameter("username");//通过参数名(url),获取参数值
        String age = request.getParameter("age");//通过参数名(url),获取参数值
        System.out.println("username=" + username + "age=" + age);
        request.setAttribute("username", username);
        request.setAttribute("age", age);
        //调用业务，页面跳转
        //return "forward:hello";////拼接URL  /WRB-INF/page/hello.jsp(默认用转发方式跳转，url不变)
        return "redirect:hello";//拼接URL  /WRB-INF/page/hello.jsp(重定向方式跳转，url改变)
    }

    @RequestMapping(value = "/param3")
    public String param3(HttpServletRequest request, HttpSession session) {
        System.out.println("------param3()------");
        //接受处理，调用业务，跳转页面
        //接收数据
        String username = request.getParameter("username");//通过参数名(url),获取参数值
        String age = request.getParameter("age");//通过参数名(url),获取参数值
        System.out.println("username=" + username + "age=" + age);
        session.setAttribute("username", username);//将数据放入session
        session.setAttribute("age", age);//将数据放入session
        //调用业务，页面跳转
        //return "forward:hello";////拼接URL  /WRB-INF/page/hello.jsp(默认用转发方式跳转，url不变)
        return "hello";//拼接URL  /WRB-INF/page/hello.jsp(重定向方式跳转，url改变)
    }

    @RequestMapping(value = "/param4")
    public String param4(String username, int age) {
        System.out.println("------param4()------");
        System.out.println("username=" + username + "age=" + age);
        //调用业务，页面跳转
        //return "forward:hello";////拼接URL  /WRB-INF/page/hello.jsp(默认用转发方式跳转，url不变)
        return "/hello.do";//拼接URL  /WRB-INF/page/hello.jsp(重定向方式跳转，url改变)
    }

    @RequestMapping(value = "/test1")
    public String test1() {
        System.out.println("------test1()------");
        //调用业务，页面跳转
        return "forward:/param1/test2";
    }

    @RequestMapping(value = "/test2")
    public String test2() {
        System.out.println("------test2()------");
        //调用业务，页面跳转
        return "hello";//拼接URL  /WRB-INF/page/hello.jsp(默认用转发方式跳转，url不变)
    }

    @RequestMapping(value = "/param5")
    public String param5(@RequestParam(value = "username",required = false) String u,
            @RequestParam(value = "age",required = true,defaultValue = "20") int a) {//数据绑定
        System.out.println("------param5()------");
        System.out.println("username="+u+",age="+a);
        //调用业务，页面跳转
        return "hello";//拼接URL  /WRB-INF/page/hello.jsp(默认用转发方式跳转，url不变)
    }
    @RequestMapping(value = "/param6")
    public String param6(HttpServletRequest request) {
        System.out.println("------param6()------");
        System.out.println("username="+request.getParameter("username")
                +",age="+request.getParameter("age"));
        //调用业务，页面跳转=
        return "hello";//拼接URL  /WRB-INF/page/hello.jsp(默认用转发方式跳转，url不变)
    }
}

