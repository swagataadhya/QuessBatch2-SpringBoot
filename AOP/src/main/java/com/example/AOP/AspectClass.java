package com.example.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectClass {
    @Before(value = "execution(* com.example.AOP.Controller.*(..))")
    public void runMyProgram(JoinPoint joinPoint)
    {
        System.out.println("Before is calling");
    }
    @After(value = "execution(* com.example.AOP.Controller.*(..))")
    public void runMyProgram1(JoinPoint joinPoint)
    {
        System.out.println("After is calling");
    }
    @AfterThrowing(value = "execution(* com.example.AOP.Controller.*(..))")
    public void runMyProgram2(JoinPoint joinPoint)
    {
        System.out.println("Throw is calling");
    }
}
