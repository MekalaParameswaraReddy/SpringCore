package com.paramesh.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class JavaCollections {
	private List namesList;
	private Set groupSet;
	private Map itemAndPrice;
	private Properties connectionProperties;
	
	public List getNamesList() {
		return namesList;
	}

	public void setNamesList(List namesList) {
		this.namesList = namesList;
	}
	public Set getGroupSet() {
		return groupSet;
	}
	
	public void setGroupSet(Set groupSet) {
		this.groupSet = groupSet;
	}

	public Map getItemAndPrice() {
		return itemAndPrice;
	}

	public void setItemAndPrice(Map itemAndPrice) {
		this.itemAndPrice = itemAndPrice;
	}
	
	public Properties getConnectionProperties() {
		return connectionProperties;
	}
	
	public void setConnectionProperties(Properties connectionProperties) {
		this.connectionProperties = connectionProperties;
	}	
}
