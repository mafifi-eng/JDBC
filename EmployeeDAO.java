package com.assignment;

import java.util.List;

public interface EmployeeDAO {
	  // define some CRUD operations here
	  public List<Employee> getAllEmployees();
	  public void updateEmployeeById(int id);
	  public void deleteEmployeeById(int id);
	  public void addEmployee(Employee e);

}
