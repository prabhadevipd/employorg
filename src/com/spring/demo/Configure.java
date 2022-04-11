package com.spring.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Configure {
	@Bean
	public Employ emp()
	{
		return new Employ();
	}
	
@Bean
public Organization org()
{
	return new Organization();
}

	

}
