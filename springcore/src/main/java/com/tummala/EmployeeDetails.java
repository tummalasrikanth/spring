package com.tummala;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tummala.beans.EmployeeBean;
import com.tummala.service.EmployeeService;

public class EmployeeDetails {

	public static void main(String[] args) {
		ApplicationContext context = null;
		
		/*Interface Injection start*/
		try {
			context = new ClassPathXmlApplicationContext("employee.xml");
			EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
			ArrayList<EmployeeBean> employeeList = employeeService.getEmployeeDetails();
			if (null != employeeList && !employeeList.isEmpty()) {
				for (EmployeeBean e : employeeList) {
					System.out.println("EMPNO: " + e.getEmpNo() + " EMP Name:" + e.getEmpName());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*Interface Injection start*/
		
		/*Setter Injection start*/
		try {
			context = new ClassPathXmlApplicationContext("employee.xml");
			EmployeeSetterInjection emp=(EmployeeSetterInjection)context.getBean("employeeSetterInjection");
			if(null!=emp) {
				System.out.println(emp.getAddress());
				EmployeeService employeeService =emp.getEmployeeService();
				ArrayList<EmployeeBean> employeeList = employeeService.getEmployeeDetails();
				if (null != employeeList && !employeeList.isEmpty()) {
					for (EmployeeBean e : employeeList) {
						System.out.println("EMPNO: " + e.getEmpNo() + " EMP Name:" + e.getEmpName());
					}
				}
			}
		}catch(Exception e) {
			
		}
		/*Setter Injection end*/
		
		
		/*Constructor Injection start*/
		try {
			context = new ClassPathXmlApplicationContext("employee.xml");
			EmployeeConstructorInjection emp=(EmployeeConstructorInjection)context.getBean("employeeConstructorInjection");
			if(null!=emp) {
				System.out.println(emp.getAddress());
				EmployeeService employeeService =emp.getEmployeeService();
				ArrayList<EmployeeBean> employeeList = employeeService.getEmployeeDetails();
				if (null != employeeList && !employeeList.isEmpty()) {
					for (EmployeeBean e : employeeList) {
						System.out.println("EMPNO: " + e.getEmpNo() + " EMP Name:" + e.getEmpName());
					}
				}
			}
		}catch(Exception e) {
			
		}
		/*Constructor Injection end*/
		

	}

}
