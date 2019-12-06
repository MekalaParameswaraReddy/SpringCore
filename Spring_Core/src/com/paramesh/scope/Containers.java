package com.paramesh.scope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Spring provides following two distinct types of containers. 1. BeanFactory
 * container 2. ApplicationContext container
 * 
 * ApplicationContext: FileSystemXmlApplicationContext,
 * ClassPathXmlApplicationContext, WebXmlApplicationContext
 */
public class Containers {
	public static void main(String[] args) {
		//BeanFactory
		
		// ClassPathResource resource = new
		// ClassPathResource("D:\\Learnings\\Practice_Workspace_Java_1\\Spring_Mavne\\src\\Scopes.xml");
		// BeanFactory factory = new XmlBeanFactory(resource);

		// Resource res = new
		// FileSystemResource("D:\\Learnings\\Practice_Workspace_Java_1\\Spring_Mavne\\src\\Scopes.xml");
		// XmlBeanFactory factory = new XmlBeanFactory(res);
		
		//ApplicationContext
		
		// ApplicationContext factory = new
		// FileSystemXmlApplicationContext("D:\\Learnings\\Practice_Workspace_Java_1\\Spring_Mavne\\src\\Scopes.xml");

		ApplicationContext factory = new ClassPathXmlApplicationContext("Scopes.xml");

		Scopes hello = (Scopes) factory.getBean("HelloBean_container");
		System.out.println(hello.scopePls("Container"));
	}

}
