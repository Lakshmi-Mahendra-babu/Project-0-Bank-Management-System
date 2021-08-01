package com.bankmanagement.dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import com.bankmanagement.bankmanagement.Employee;
import com.bankmanagement.config.DBConnectionSingleton;


public class EmployeeDAOImplementation implements EmployeeDAO {

	@Override
	public int newEmployee(Employee emp) {
		// TODO Auto-generated method stub
		int result=0;
		try {
			PreparedStatement pstmt=(DBConnectionSingleton.getConnectionInstance())
					.prepareCall("insert into  Employee(EmployeeName,Password,MailId,MobileNumber) values(?,?,?,?)");
			pstmt.setString(1, emp.getEmployeeName());
			pstmt.setString(2, emp.getPassword());
			pstmt.setString(3, emp.getMailId());
			pstmt.setLong(4, emp.getMobileNumber());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public List<Employee> existingEmployee(int EmployeeId) {
	 
		
		List<Employee> listOfemp=null;
		try {
			PreparedStatement pstmt=(DBConnectionSingleton.getConnectionInstance())
					.prepareCall("select * from Employee where EmployeeId="+EmployeeId+"");
			Employee emp=new Employee();
			//.setInt(1,emp.getEmployeeId());
		    //result = pstmt.execute();
			ResultSet rs = pstmt.executeQuery();
			listOfemp=new ArrayList<Employee>();
			while(rs.next()) {
			emp.setPassword(rs.getString(3));
			listOfemp.add(emp);
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listOfemp;
	}

}
