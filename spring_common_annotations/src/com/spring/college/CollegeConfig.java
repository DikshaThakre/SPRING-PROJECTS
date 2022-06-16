package com.spring.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.college")
@PropertySource("classpath:college-info-properties")
public class CollegeConfig {
	
	/*
	@Bean
	public Teacher mathTeacherBean()
	{
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalBean()
	{
		return new Principal();
	}
	
	//@Bean(name = {"colBean", "collegeBeanAnother"})  //We can provide multiple alias name to bean id
	//@Bean(name = "colBean")
	@Bean
	public College collegeBean()  //collegeBean - bean id unless we don't specify bean id in @Bean
	{
		//College college = new College(principalBean());
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}
	*/

}
