package com.paramesh.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class LifeCycleImpl implements LifeCycle, InitializingBean, DisposableBean{
	
	private String msg;
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String nonLifeCycleMethod() {		
		return "This request is for :: " + getMsg() ;
	}
	
	public void customInit() {
		System.out.println("Life cycle init method :: " + msg);
	}
	
	public void customDestroy() {
		System.out.println("Life cycle customDestroy method :: " +msg);
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean :: " + msg);		
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean :: " + msg);		
	}
}
