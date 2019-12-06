package com.paramesh.AutoComponentsScanning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.paramesh.AutoComponentsScanning.service.CustomerServiceWithoutComponent;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class Test {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"Filter-component.xml" });

		/*CustomerService cust = (CustomerService) context
				.getBean("custService_");
		System.out.println(cust);
		*/
		
		CustomerServiceWithoutComponent noCom  = (CustomerServiceWithoutComponent)context.getBean("customerServiceWithoutComponent");
		System.out.println(noCom.toString());
		

	}

}
