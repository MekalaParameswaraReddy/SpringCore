package com.paramesh.AutoComponentsScanning.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.paramesh.AutoComponentsScanning.dao.CustomerDaoWithoutComponent;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */

public class CustomerServiceWithoutComponent {
	
	@Autowired(required = true)
	CustomerDaoWithoutComponent customerDaoWithoutComponent;
	
	public String toString() {
		return "Customer Service Without Component = [" + customerDaoWithoutComponent + "]";
	}
}
