package com.assignment;

import java.util.List;

public class Runnable {

	public static void main(String[] args) {

		EmployeeDAO dao = new EmployeeDAOImplOracle();
		List<Employee> allEmpls = dao.getAllEmployees();
		allEmpls.forEach( e -> System.out.println(e.getJob()));

		//dao.deleteEmployeeById(0);

	}

}
