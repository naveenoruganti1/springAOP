package com.aa.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	@Around("execution(* com.aa.beans.Calculator.add(..))")
	public Object log(ProceedingJoinPoint pjp) throws Throwable {
		Object ret = null;
		Object[] args = null;
		
		System.out.print("Entered into method: "+pjp.getSignature().getName()+" (");
		args = pjp.getArgs();
		for(int i=0; i<args.length; i++) {
			if(i==0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print(","+args[i]);
		}
		System.out.println(")");
		ret = pjp.proceed();
		System.out.println("exit from method: "+pjp.getSignature().getName()+" with value as: "+ret);
		return ret;
	}
}
