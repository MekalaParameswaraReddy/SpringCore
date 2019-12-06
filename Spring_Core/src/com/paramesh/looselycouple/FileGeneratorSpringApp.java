package com.paramesh.looselycouple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class FileGeneratorSpringApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("LooselyCouple.xml");
		OutputHelper fileGenerator = (OutputHelper)context.getBean("output");
		fileGenerator.getFileGenerator().generateOutput();
	}
}
