package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
class MyAspect {

    @Before("execution(public * *(..)) && within(com.example..*) && @target(org.springframework.web.bind.annotation.RestController))")
    public void doSomethingHere(JoinPoint joinPoint) {

        System.out.println("In controller method" + joinPoint.getSignature().toShortString());
    }

}
