package com.aspect.config;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// com.aspect класс который обрабатывает сквозную функциональность
@Aspect
@Component
public class LoggingAspect {

//	@Before("execution(* com.aspect.dao.PersonDAOImpl.getPersonById(..))")
//	public void logBefore(JoinPoint joinPoint) {
//
//		System.out.println("logBefore() is running!");
//		System.out.println("hijacked : " + joinPoint.getSignature().getName());
//		System.out.println("******");
//	}

	/*@After("execution(* com.mkyong.customer.bo.CustomerBo.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("logAfter() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");

	}*/
	
	@AfterReturning(
			pointcut = "execution(* com.aspect.dao.PersonDAOImpl.getPersonById(..))",
			returning= "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		System.out.println("logAfterReturning() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
		System.out.println("******");

	}
	
	/*@AfterThrowing(
			pointcut = "execution(* com.mkyong.customer.bo.CustomerBo.addCustomerThrowException(..))",
			throwing= "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

		System.out.println("logAfterThrowing() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("******");

	}*/
	
	// around совет который отрабатывает на точке соединения
	//метод AddCustomerAround  является точкой соединения
//	@Around("execution(* com.aspect.dao.PersonDAOImpl.getPersonById(..))")
//	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
//
//		System.out.println("logAround() is running!");
//		System.out.println("hijacked method : " + joinPoint.getSignature().getName());
//		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
//
//		System.out.println("Around before is running!");
//		joinPoint.proceed();// отрабатывает метод ,за которым мы следим
//		System.out.println("Around after is running!");
//
//		System.out.println("******");

//	}
	
}