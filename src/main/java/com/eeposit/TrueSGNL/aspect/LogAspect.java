package com.eeposit.TrueSGNL.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * Created with Eclipse.
 * User: Sudeep
 * Date: 2017-12-14
 * Time: 04:01 PM
 */
@Slf4j
@Aspect
@Component
public class LogAspect {
	
	@Before("execution(* com.eeposit.TrueSGNL.controller.*.*(..))")
	public void allControllerCalled(JoinPoint joinPoint) {   	

		log.info("arguments " + Arrays.toString(joinPoint.getArgs()));
		log.info("Method " + joinPoint.getSignature().getName() + " called in controller");
	}

	@After("execution(* com.eeposit.TrueSGNL.controller.*.*(..))")
	public void allControllerExited(JoinPoint joinPoint) {
		log.info("Exited from method "+joinPoint.getSignature().getName());
	}

}
