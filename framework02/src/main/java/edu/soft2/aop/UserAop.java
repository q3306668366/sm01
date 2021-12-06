package edu.soft2.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Aspect
@Component
public class UserAop {
    @Around("execution(* edu.soft2.service.UserService.addUser(..))")
    public Object aroundAdd(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println(pjp.getSignature().getName()+"方法的前置环绕增强~");
        Object result = pjp.proceed();
        System.out.println(pjp.getSignature().getName()+"方法的后置环绕增强~");
        return result;
    }

    @Around("execution(* edu.soft2.service.UserService.delUser(..))")
    public Object aroundDelete(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println(pjp.getSignature().getName()+"方法的前置环绕增强~");
        Object result = pjp.proceed();
        System.out.println(pjp.getSignature().getName()+"方法的后置环绕增强~");
        return result;
    }


    @Around("execution(* edu.soft2.service.UserService.updateUser(..))")
    public Object aroundUpdate(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println(pjp.getSignature().getName()+"方法的前置环绕增强~");
        Object result = pjp.proceed();
        System.out.println(pjp.getSignature().getName()+"方法的后置环绕增强~");
        return result;
    }


    @Around("execution(* edu.soft2.service.UserService.queryUser(..))")
    public Object aroundQuery(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println(pjp.getSignature().getName()+"方法的前置环绕增强~");
        Object result = pjp.proceed();
        System.out.println(pjp.getSignature().getName()+"方法的后置环绕增强~");
        return result;
    }



    /*//1.设置切入点
    //private static final Logger log = Logger.getLogger(UserAop.class);//错误！
    @Pointcut("execution(* edu.soft2.service..*.*(..))") //设置切入点的拦截范围
    public void pointA() {
    }

    //2.设置前置增强
    @Before(value = "pointA()")
    public void beforeA() {
        System.out.println("前置增强！！！");
    }

    //3.设置后置增强
    @After(value = "pointA()")
    public void afterA() {
        System.out.println("后置增强！！！");
    }

    //4.环绕增强
    @Around(value = "pointA()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object res = null;
        //System.out.println("前环绕增强");//环绕增强的前半环绕
        System.out.println("准备执行目标对象" + pjp.getTarget() + "的"
                + pjp.getSignature().getName() + "()方法");
        res = pjp.proceed();//执行aop代理链方法
        //System.out.println("后环绕增强");
        System.out.println("已经执行目标对象" + pjp.getTarget() + "的"
                + pjp.getSignature().getName() + "()方法");
        return res;
    }
    @AfterReturning(value = "pointA()",returning = "result")
    public void afterRe(JoinPoint jp,Object result){//方法执行(没有异常)完毕被调用
        System.out.println("执行完毕"+ jp.getTarget() + "的"
                        + jp.getSignature().getName() + "()方法，返回值为"+ result);
    }*/
}
