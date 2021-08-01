package com.bankmanagement.bo;

import java.util.List;

import com.bankmanagement.bankmanagement.Employee;
import com.bankmanagement.dao.EmployeeDAO;
import com.bankmanagement.dao.EmployeeDAOImplementation;


public class EmployeeBOImplementation implements EmployeeBO{

	@Override
	public int newUser(Employee emp) {
		EmployeeDAO udao=new EmployeeDAOImplementation();
		int status =udao.newEmployee(emp);
		return status;
	}

	@Override
	public List<Employee> existingEmployee(int EmployeeId) {
		// TODO Auto-generated method stub
		EmployeeDAO udao=new EmployeeDAOImplementation();
		List<Employee> status=udao.existingEmployee(EmployeeId);
		return status;
	}

}
