package com.code.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//read the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container, default bean Id
		Coach football = context.getBean("footBallCoach", Coach.class);
		
		//get the bean from spring container, custom bean Id
		Coach coach = context.getBean("thatSillyCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(coach.getDailyWorkOut());
		System.out.println(football.getDailyWorkOut());
		System.out.println(coach.getDailyFortune());
		System.out.println(football.getDailyFortune());
		//close the context
		context.close();
	}

}
