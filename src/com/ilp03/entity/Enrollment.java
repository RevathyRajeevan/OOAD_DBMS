package com.ilp03.entity;

import java.sql.Date;

public class Enrollment {
	private int enrollmentID;
	private int programID;
	private int employeeID;
	private Date enrollmentDate;

	public Enrollment(int enrollmentID, int programID, int employeeID, Date enrollmentDate) {
		super();
		this.enrollmentID = enrollmentID;
		this.programID = programID;
		this.employeeID = employeeID;
		this.enrollmentDate = enrollmentDate;
	}

	public Enrollment() {

	}

	public int getEnrollmentID() {
		return enrollmentID;
	}

	public void setEnrollmentID(int enrollmentID) {
		this.enrollmentID = enrollmentID;
	}

	public int getProgramID() {
		return programID;
	}

	public void setProgramID(int programID) {
		this.programID = programID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public Date getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

}
