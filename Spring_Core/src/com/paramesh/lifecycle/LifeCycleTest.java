package com.paramesh.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The ConfigurableApplicationContext.close() will close the application
 * context, releasing all resources and destroying all cached singleton beans.
 * 
 */
public class LifeCycleTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("LifeCycle.xml");
		LifeCycle lifeCycle = (LifeCycle) context.getBean("LC");
		System.out.println(lifeCycle.nonLifeCycleMethod());
		context.close();
	}
}
