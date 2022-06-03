package com.incapp.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectClass {
	
	@Before("execution(public * eat())")
	public void three() {
	System.out.println("* * *");	
	}
	
	@After("execution(public * addInt(..))")
	public void four() {
		System.out.println("* * * *");
	}
	
	@Before("execution(public * addString(..))")
	public void five() {
		System.out.println("* * * * *");
	}

}
