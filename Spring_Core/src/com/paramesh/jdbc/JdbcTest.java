package com.paramesh.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class JdbcTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		EmployeeDAO empDao = (EmployeeDAO) context.getBean("emloyeeDao");
	
		List<Employee> listEmp = empDao.usingDataSource_getEmpById(12);
		Iterator<Employee> it = listEmp.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.getId() + " " + emp.getFirstname() + " "
					+ emp.getLastName() + " " + emp.getGender());
		}
		
		List<Employee> jdbcTemplageList = empDao.usingJdbcTemplate_getEmpById(12);
		Iterator<Employee> jdbcTemplageIt = jdbcTemplageList.iterator();
		
		while (jdbcTemplageIt.hasNext()) {
			Employee emp = jdbcTemplageIt.next();
			System.out.println(emp.getId() + " " + emp.getFirstname() + " "
					+ emp.getLastName() + " " + emp.getGender());
		}
	}
}
