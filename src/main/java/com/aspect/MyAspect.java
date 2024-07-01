package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    //定义切点
//    @Pointcut("execution(* com.service..*.*(..))")
    @Pointcut("@annotation(com.annotation.InvokeLog)")
    public void pt(){

    }

    //进行增强
    @Before("pt()")
    public void before(JoinPoint pj){
        Signature signature = pj.getSignature();
        Class declaringType = signature.getDeclaringType();
        String name = signature.getName();
        System.out.println(declaringType + ", " + name);
        System.out.println("before===");

    }
}
