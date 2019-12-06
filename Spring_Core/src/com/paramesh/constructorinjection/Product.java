package com.paramesh.constructorinjection;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class Product {
	
	private int id;
	private String name;
	private String model;
	
	public Product(String model, String name, int id ) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
	}
	
	public String getProductDetails(){
		return "product name is =" + name + "\n product id is = "+ id +"\n product Model is= "+model;
	}
}
