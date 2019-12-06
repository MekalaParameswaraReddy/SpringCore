package com.paramesh.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class EmployeeDAOImpl implements EmployeeDAO{

	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate; 
	
	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		System.out.println("getting up :: jdbcTemplate");
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		System.out.println("Settign up :: jdbcTemplate");
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Employee> usingDataSource_getEmpById(int id) {
		String sql = "SELECT * FROM employee WHERE id >= ?";
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		Employee employee = null;
		List<Employee> emp = new ArrayList<Employee>();
		try {
			con = dataSource.getConnection();
			psmt =  con.prepareStatement(sql);
			psmt.setInt(1, id);
			rs = psmt.executeQuery();
			while(rs.next()){
				employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setFirstname(rs.getString("firstname"));
				employee.setLastName(rs.getString("lastname"));
				employee.setGender(rs.getString("gender"));
				emp.add(employee);
			}
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return emp;
	}
	
	@Override
	public List<Employee> usingJdbcTemplate_getEmpById(int id) {
		String sql = "SELECT * FROM employee WHERE id = ?";
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		List<Employee> emp = new ArrayList<Employee>();
		
		Employee employee = (Employee)getJdbcTemplate().queryForObject(
				sql, new Object[] { id }, new CustomerRowMapper());
		emp.add(employee);
		return emp;
	}

}
