package be.rd.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Does not require implementing the interfaces.
 * 
 *
 */
public class MyAdvice {

	public void simpleBeforeAdvice(){
		System.out.println("Before advice ...");
	}
	
	public Object simpleAroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
		
		System.out.println("Around advice " + pjp.getSignature().getName() + " before ...");
		Object result = pjp.proceed();
		System.out.println("Around advice " + pjp.getSignature().getName() + " after ... result = " + ((Integer)result).intValue());
		return result;
	}
}
