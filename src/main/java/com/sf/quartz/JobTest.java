package com.sf.quartz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobTest {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext.xml");
	}
}
