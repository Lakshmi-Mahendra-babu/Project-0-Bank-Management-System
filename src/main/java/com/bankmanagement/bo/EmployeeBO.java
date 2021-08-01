package com.bankmanagement.bo;



import java.util.List;

import com.bankmanagement.bankmanagement.Employee;

public interface EmployeeBO {
	public int newUser(Employee emp);
	public List<Employee> existingEmployee(int EmployeeeId);
}
