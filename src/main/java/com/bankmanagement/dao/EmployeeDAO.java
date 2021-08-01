package com.bankmanagement.dao;


import java.util.List;

import com.bankmanagement.bankmanagement.Employee;

public interface EmployeeDAO {
	public int newEmployee(Employee emp);
	public List<Employee> existingEmployee(int EmployeeId);
}
