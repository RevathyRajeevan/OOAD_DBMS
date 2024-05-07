package com.ilp03.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ilp03.entity.Assessment;
import com.ilp03.entity.Employee;
import com.ilp03.entity.Enrollment;
import com.ilp03.entity.Feedback;

public class EmployeeDAO {
	public static Connection getConnection() {
		String connectionString = "jdbc:mysql://localhost:3306/trainingprogram_db?useSSL=false";
		String userName = "root";
		String password = "Password@1";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionString, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void insertIntoEmployees(Connection connection, String employeeFirstName,String employeeLastName,String employeeEmail,long employeePhno,int createdBy,int updatedBy,Date createdDate,Date updatedDate) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(
					" INSERT INTO employee (employee_firstname, employee_lastname, employee_email, employee_phno, "
					+ "created_by,updated_by,created_date,updated_date)VALUES (?,?,?,?,?,?,?,?)");

			preparedStatement.setString(1,employeeFirstName );
			preparedStatement.setString(2,employeeLastName );
			preparedStatement.setString(3,employeeEmail );
			preparedStatement.setLong(4,employeePhno );
			preparedStatement.setLong(5,createdBy );
			preparedStatement.setLong(6,updatedBy );
			preparedStatement.setDate(7,createdDate );
			preparedStatement.setDate(8,updatedDate );
			int rowsInserted = preparedStatement.executeUpdate();
	        if (rowsInserted > 0) {
	            System.out.println("Employee data inserted successfully!");
	        } else {
	            System.out.println("Failed to insert employee data.");
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public static ArrayList<Employee> getEmployeeBasedOnProgram(Connection connection, String programName) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(
					"SELECT e.employee_id,e.employee_firstname, e.employee_lastname, e.employee_email, e.employee_phno,en.enrollment_id,"
							+ " a.assessment_score, f.feedback_text, f.attendance_status FROM employee e INNER JOIN enrollment en ON e.employee_id = en.employee_id INNER JOIN assessment a ON en.enrollment_id = a.enrollment_id "
							+ "INNER JOIN feedback f ON en.enrollment_id = f.enrollment_id INNER JOIN training_programs tp ON en.program_id = tp.program_id WHERE tp.program_name = ?");

			preparedStatement.setString(1, programName);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				int employeeID = resultSet.getInt(1);
				String employeeFirstName = resultSet.getString(2);
				String employeeLastName = resultSet.getString(3);
				String employeeEmail = resultSet.getString(4);
				long employeePhno = resultSet.getLong(5);
				Enrollment enrollment = new Enrollment();
				enrollment.setEnrollmentID(resultSet.getInt(6));
				Assessment assessment = new Assessment();
				assessment.setAssessmentScore(resultSet.getInt(7));
				Feedback feedback = new Feedback();
				feedback.setFeedbackText(resultSet.getString(8));
				feedback.setAttendanceStatus(resultSet.getString(9));
				Employee employee = new Employee();
				employee.setEmployeeID(employeeID);
				employee.setEmployeeFirstName(employeeFirstName);
				employee.setEmployeeLastName(employeeLastName);
				employee.setEmployeeEmail(employeeEmail);
				employee.setEmployeephno(employeePhno);
				employee.setEnrollment(enrollment);
				employee.setAssessment(assessment);
				employee.setFeedback(feedback);
				employeeList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeList;
	}
}
