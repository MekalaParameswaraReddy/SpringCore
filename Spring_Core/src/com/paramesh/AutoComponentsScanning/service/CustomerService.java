package com.paramesh.AutoComponentsScanning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paramesh.AutoComponentsScanning.dao.CustomerDAO;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
@Component("custService_")
public class CustomerService {
	
	@Autowired
	CustomerDAO CustomerDAO;
	
	public String toString() {
		return "CustomerService = [" + CustomerDAO + "]";
	}
}
