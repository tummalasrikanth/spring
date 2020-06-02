package com.tummala.service.impl;

import java.util.ArrayList;

import com.tummala.beans.EmployeeBean;
import com.tummala.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public ArrayList<EmployeeBean> getEmployeeDetails() {
		ArrayList<EmployeeBean> al = new ArrayList<>();
		al.add(new EmployeeBean(1, "Srikanth"));
		al.add(new EmployeeBean(2, "Priyanka"));
		return al;
	}

}
