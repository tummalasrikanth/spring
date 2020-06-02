package com.tummala;

import com.tummala.service.EmployeeService;

public class EmployeeConstructorInjection {

	private EmployeeService employeeService;
	private String address;

	public EmployeeConstructorInjection(EmployeeService employeeService, String address) {
		super();
		this.employeeService = employeeService;
		this.address = address;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public String getAddress() {
		return address;
	}

}
