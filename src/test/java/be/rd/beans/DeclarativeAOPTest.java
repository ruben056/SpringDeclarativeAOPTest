package be.rd.beans;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeclarativeAOPTest {

	private ClassPathXmlApplicationContext appCtx;
	private ClassPathXmlApplicationContext getAppCtx(){
		if(appCtx == null){
			appCtx = new ClassPathXmlApplicationContext("aopcontext.xml");
		}
		return appCtx;
	}
	
	@Test
	public void testAOP(){
		DependingBean bean = getAppCtx().getBean("myBean", DependingBean.class);
		
		bean.addSomeNumbers();
	}
}
