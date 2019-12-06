package com.paramesh.autowiring;

import java.util.Date;

/**
 * In Spring, 5 Auto-wiring modes are supported.
 * 
 * no – Default, no auto wiring, set it manually via “ref” attribute
 * 
 * byName – Auto wiring by property name. If the name of a bean is same as the
 * name of other bean property, auto wire it.
 * 
 * byType – Auto wiring by property data type. If data type of a bean is
 * compatible with the data type of other bean property, auto wire it.
 * 
 * constructor – byType mode in constructor argument.
 * 
 * autodetect – If a default constructor is found, use “autowired by
 * constructor”; Otherwise, use “autowire by type”.
 * 
 */
public class Customer {

	String custName;

	Person person;
	
	Date date = null;
	
	Customer(){
		
	}
	Customer(Date date){
		this.date = date;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void showDate(){
		System.out.println("Today date is == " + date);
	}
}
