package com.code.SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach = context.getBean("swimCoach", Coach.class);
		
		SwimCoach swimCoach = context.getBean(SwimCoach.class);
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getName());
		
	}
}
