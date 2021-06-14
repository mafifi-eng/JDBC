package com.assignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.ConnectionUtil;

public class EmployeeDAOImplOracle implements EmployeeDAO {

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<>();
		
		String QUERY = "select * from emp";
		try(Connection con = ConnectionUtil.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY))
		
		    {	
				while(rs.next()){
				int empNo = rs.getInt("EMPNO");
				String ename = rs.getString("ENAME");
				String job = rs.getString("JOB");
				Employee emp = new Employee(empNo, ename, job, 0, null, 0, 0, 0);
				list.add(emp);
			}//try
		} catch (SQLException e) {e.printStackTrace(); }
		return list;
	}

	@Override
	public void updateEmployeeById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeById(int id) {
		String QUERY = "delete from emp where empno = "+id;
		try {	
			Connection con = ConnectionUtil.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);	
			}//try
		 catch (SQLException e) {e.printStackTrace(); }
		
	}

	@Override
	public void addEmployee(Employee e) {
		String QUERY = "insert into emp values ("+e.getDeptNo() + ","+e.geteName()+","+e.getJob()+",0,09-JUN-81,0,0,0";
		try {	
			Connection con = ConnectionUtil.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);	
			}//try
		 catch (SQLException e1) {e1.printStackTrace(); }
		
	}

}
