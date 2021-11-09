//package com.example.springmvc.aspect;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import java.sql.SQLOutput;
//
//@Component
//@A
//@Order(2)
//public class LoggingAspect {
//
//    @Pointcut("execution(* *())")
//    public void logging(){}
//
//    @Before("logging()")
//    public void logAdvice(){
//        System.out.println("LOGGING");
//    }
//
//    @Around("logging()")
//    public Object logAroundAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//        System.out.println("Before proceeding");
//        Object proceedingResult=proceedingJoinPoint.proceed();
//        System.out.println("After proceeding proceedingResult="+proceedingResult);
//        return proceedingResult;
//    }
//}
