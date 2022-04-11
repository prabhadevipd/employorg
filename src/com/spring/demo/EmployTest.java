package com.spring.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext iocContainer=new AnnotationConfigApplicationContext(Configure.class);
Employ e=(Employ)iocContainer.getBean("emp");
e.setId(101);
e.setName("athvi");
e.setStaddr("CMT");
System.out.println(e.getId()+ e.getName()+ e.getStaddr());
Organization org=(Organization)iocContainer.getBean("org");
org.setName("athvi");
org.setAddress("Chennai");
org.setId(101);
System.out.println(org.getName()+ org.getAddress()+ org.getId());
	}

}
