package com.paramesh.looselycouple.factorymethoddesign;
/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class PlanFactory {

	public Plan getPlanType(String planTyp) {
		if (planTyp == null) {
			return null;
		}
		if (planTyp.equalsIgnoreCase("DomosticPlan")) {
			return new DomosticPlan();
		} else if (planTyp.equals("InistitutionPlan")) {
			return new InistitutionPlan();
		} else if (planTyp.equals("CommercialPlan")) {
			return new CommercialPlan();
		}
		return null;
	}
}
