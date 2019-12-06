package com.paramesh.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class ScopesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
		System.out.println("Current dir using System:" + currentDir);
		ApplicationContext context = new ClassPathXmlApplicationContext("Scopes.xml");
		Scopes hello = (Scopes) context.getBean("SB");
		Scopes hello1 = (Scopes) context.getBean("SB");
		Scopes hello2 = (Scopes) context.getBean("SB");
		String value = hello.scopePls("bean scope is == ");
		System.out.println(value);
		System.out.println(hello.hashCode());
		System.out.println(hello1.hashCode());
		System.out.println(hello2.hashCode());
	}
}
