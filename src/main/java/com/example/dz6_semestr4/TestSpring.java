package com.example.dz6_semestr4;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan("com.example.dz6_semestr4")
public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean helloBean = context.getBean("testBean", HelloBean.class);
		System.out.println(helloBean.getName());
		context.close();

	}

}
