package be.rd.beans;

import org.springframework.beans.factory.annotation.Required;

import be.rd.service.CalcService;

public class DependingBean {

	private CalcService service;
	
	@Required
	public void setCalcService(CalcService calcService){
		this.service = calcService;
	}
	
	public void addSomeNumbers(){
		int result = service.add(3, 6);
		
	}
	
}
