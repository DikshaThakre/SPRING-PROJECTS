package com.spring.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("collegeBean")  //collegeBean is bean id
@Component  //If we don't provide the bean id, by default bean id will be same as class name (First letter will be smallcase) In this case: college
public class College {
	
	@Value("${college.Name}")
	private String collegeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;    //= new MathTeacher();
	
	@Required
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	//Dependency Injection using Constructor
	/*public College(Principal principal) {
		this.principal = principal;
	}*/
		
	//@Autowired
	/*public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	//Dependency Injection using Setter
	//@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using setPrincipal method");
	}*/

	public void test()
	{
		principal.principalInfo();
		teacher.teach();
		System.out.println("My college name is : " + collegeName);
		System.out.println("testing this method");
	}

}
