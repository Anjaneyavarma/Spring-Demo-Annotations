package com.code.SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ComponentScan("com.code.SpringDemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// add support to resolve ${...} properties
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer
//                    propertySourcesPlaceHolderConfigurer() {
//        
//        return new PropertySourcesPlaceholderConfigurer();
//    }
	
	//define bean for our sadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for the swim coach
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
