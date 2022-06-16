package com.spring.beanlifecycle.annotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean,DisposableBean{
	
	/*public void init() {
	
		System.out.println("Inside Hello class init method");
	}
	
	public void destroy() {
		
		System.out.println("Inside Hello class destroy method");
	}*/

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside after property set method --> init");
		
	}
	
	public void sample()
	{
		System.out.println("my coding starts from here");
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy method");
		
	}
}
