package com.paramesh.looselycouple.factorymethoddesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class TestApp {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		PlanFactory factory = new PlanFactory();
		System.out.println("Follwoing Plan type are available please choose suitable plan type: ");
		System.out.println("DomosticPlan");
		System.out.println("InistitutionPlan");
		System.out.println("CommercialPlan");
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	    String PlanType = br.readLine();
		Plan plan = factory.getPlanType(PlanType);
		plan.selectYourPlan();
	}

}
