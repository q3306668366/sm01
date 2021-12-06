package edu.soft2.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 注解方式声明
 */
//@Component //声明组件类
//@Aspect    //声明切面类
public class HelloworldAspect {

    @Pointcut("execution(* edu.soft2.service..*.*(..))")
    public void myPointcut(){}

    //设置切点
//    @Pointcut("execution(public * edu.soft2.ioc.service.impl.HelloworldService.*.*(..))")
//    @Pointcut("execution(* edu.soft2.service.impl.HelloworldService.sayHello())")
//    public void myPointcut(){}

    /**
     * 前置增强
     */
    @Before("myPointcut()")
    public void beforeAdvice(){
        System.out.println("——前置通知(先执行这里)——");
    }

    /**
     * 后置增强
     */
    @After("myPointcut()")
    public void afterAdvice() {
        System.out.println("——后置通知(后执行这里)——");
    }
}
