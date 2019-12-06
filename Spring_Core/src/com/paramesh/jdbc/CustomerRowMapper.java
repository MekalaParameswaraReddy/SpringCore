package com.paramesh.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class CustomerRowMapper implements RowMapper
{
	
	public Object mapRow(ResultSet rs, int rownum) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt("id"));
		employee.setFirstname(rs.getString("firstname"));
		employee.setLastName(rs.getString("lastname"));
		employee.setGender(rs.getString("gender"));
		return employee;
	}
	
}
