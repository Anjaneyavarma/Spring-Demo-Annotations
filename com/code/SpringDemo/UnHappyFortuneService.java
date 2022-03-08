package com.code.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class UnHappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is not your lucky day!";
	}

}
