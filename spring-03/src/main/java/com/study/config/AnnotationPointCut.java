package com.study.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.study.service.UserServiceImpl3.*(..))")
    public void before(){
        System.out.println("=====方法执行前======");
    }

    @After("execution(* com.study.service.UserServiceImpl3.*(..))")
    public void after(){
        System.out.println("=====方法执行后======");
    }

    @Around("execution(* com.study.service.UserServiceImpl3.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("环绕前");
        Object proceed = jp.proceed();  //执行之后
        System.out.println("环绕后");
    }
}
