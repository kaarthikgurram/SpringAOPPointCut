package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	
	@Pointcut("execution(public void add*())")
	private void forDaoPackage(){}

	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>>> Executing @Before advise on addAccount()");
	}
}
