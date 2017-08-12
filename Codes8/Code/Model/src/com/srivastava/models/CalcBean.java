package com.srivastava.models;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalcBean
 */
@Stateless
public class CalcBean implements CalcBeanRemote {

    /**
     * Default constructor. 
     */
    public CalcBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y * 10;
	}
	
	@PostActivate
	public void postAct(){
		// Only for Stateful
	}
	
	@PrePassivate
	public void prePass(){
		// Only for Stateful
	}
	
	
	@PostConstruct
	public void start(){
		
	}
	
	@PreDestroy
	public void end(){
		
	}

}
