package com.ilp03.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.EmployeeDAO;
import com.ilp03.entity.Employee;

public class EmployeeDetailsImpl implements EmployeeDetails {

	public void getEmployeeBasedOnProgram() {
		 
		try {
			Scanner scanner = new Scanner(System.in);
			Connection connection = EmployeeDAO.getConnection();
			System.out.println("Enter the Program name(Program names : Leadership Training,Project Management Workshop,Communication Skills Seminar)");
			String programName = scanner.nextLine();
			ArrayList<Employee> employeeList = new ArrayList<Employee>();
			try {
				employeeList = EmployeeDAO.getEmployeeBasedOnProgram(connection, programName);
			} catch (Exception e) {

				e.printStackTrace();
			}
			System.out.println(
					"Employee ID\tEmployee First Name\tEmployee Last Name\tEmployee Email\t        Employee Phone Number          \tEnrollment ID\tAssessment Score\tFeedback Text\t                                Attendance Status");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			for (Employee employee : employeeList) {
				System.out.println(employee.getEmployeeID() + "             \t " + employee.getEmployeeFirstName()
						+ "            \t" + employee.getEmployeeLastName() + "               \t"
						+ employee.getEmployeeEmail() + "\t\t" + employee.getEmployeePhno() + "                     \t"
						+ employee.getEnrollment().getEnrollmentID() + "             \t"
						+ employee.getAssessment().getAssessmentScore() + "        \t"
						+ employee.getFeedback().getFeedbackText() + "                               \t"
						+ employee.getFeedback().getAttendanceStatus());
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();}
		
	System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
}
	public void insertIntoEmployees() {
		try {
			Scanner scanner = new Scanner(System.in);
			Connection connection = EmployeeDAO.getConnection();
			System.out.println("Enter Employee first name:");
     		String employeeFirstName = scanner.nextLine();
     		System.out.println("Enter Employee last name:");
     		String employeeLastName = scanner.nextLine();
     		System.out.println("Enter Employee Email:");
     		String employeeEmail = scanner.nextLine();
     		System.out.println("Enter Employee details created by:");
     		int createdBy=scanner.nextInt();
     		System.out.println("Enter Employee details updated by:");
     		int updatedBy=scanner.nextInt();
            System.out.println("Enter Employee Phone Number:");
            long employeePhno = scanner.nextLong();
            scanner.nextLine(); 
            System.out.println("Enter Employee details created date YYYY-MM-DD:");
            String dateString1 = scanner.nextLine();
            Date createdDate = Date.valueOf(dateString1);
            System.out.println("Enter Employee details updated date YYYY-MM-DD:");
            String dateString2 = scanner.nextLine();
            Date updatedDate = Date.valueOf(dateString2);
			
			 EmployeeDAO.insertIntoEmployees(connection,employeeFirstName,employeeLastName, employeeEmail, employeePhno, createdBy,  updatedBy,createdDate,  updatedDate);
			} catch (Exception e) {

				e.printStackTrace();
			}
			
	}

}
