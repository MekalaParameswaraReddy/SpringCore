package com.paramesh.collections;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class JavaCollectionsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("JavaCollections.xml");
		JavaCollections javaCollections = (JavaCollections) context.getBean("javaCollections");
		/*List list = javaCollections.getNamesList();
		Iterator it =list.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}*/
		System.out.println(javaCollections.getNamesList().toString());
		System.out.println(javaCollections.getGroupSet().toString());
		System.out.println(javaCollections.getItemAndPrice());
		System.out.println(javaCollections.getConnectionProperties());
	}

}
