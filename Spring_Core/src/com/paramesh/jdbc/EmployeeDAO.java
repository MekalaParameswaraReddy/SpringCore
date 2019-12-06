package com.paramesh.jdbc;

import java.util.List;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public interface EmployeeDAO {

	public List<Employee> usingDataSource_getEmpById(int id);
	public List<Employee> usingJdbcTemplate_getEmpById(int id);
}
