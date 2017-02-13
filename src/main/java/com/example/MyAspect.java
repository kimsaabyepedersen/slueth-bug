package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
class MyAspect {

    @Before("execution(public * *(..)) && within(com.example..*))")
    public void doSomethingHere(JoinPoint joinPoint) {
    }

}
