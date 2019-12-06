package com.paramesh.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class ProductTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjection.xml");
		Product product = (Product) context.getBean("constructorinjection");
		System.out.println(product.getProductDetails());
	}
}
