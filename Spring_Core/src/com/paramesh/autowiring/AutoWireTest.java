package com.paramesh.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class AutoWireTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("AutoWire.xml");
		Customer customer= (Customer)contex.getBean("constr");
		System.out.println(customer.getCustName());
		System.out.println(customer.getPerson().toString());
		customer.showDate();
	}
}