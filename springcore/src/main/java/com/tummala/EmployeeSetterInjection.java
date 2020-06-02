package com.tummala;

import com.tummala.service.EmployeeService;

public class EmployeeSetterInjection {

	private EmployeeService employeeService;
	private String address;

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
