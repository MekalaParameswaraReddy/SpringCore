package com.paramesh.scope;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class ScopesImpl implements Scopes {

	public String beanScope;

	ScopesImpl() {
		System.out.println("object is created.");
	}
	
	public String getBeanScope() {
		return beanScope;
	}

	public void setBeanScope(String beanScope) {
		this.beanScope = beanScope;
	}

	@Override
	public String scopePls(String scope) {		
		return getBeanScope();
	}

	
	public void customInit() {
		System.out.println("Life cycle init method");
	}
	
	public void customDestroy() {
		System.out.println("Life cycle customDestroy method");
	}
	
}
