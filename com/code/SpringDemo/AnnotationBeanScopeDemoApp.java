package com.code.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("thatSillyCoach", Coach.class);
		
		Coach myCoach = context.getBean("thatSillyCoach", Coach.class);
		
		boolean result = coach == myCoach;
		
		System.out.println(result);
	}

}
