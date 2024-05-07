package com.ilp03.entity;

import java.sql.Date;

public class Employee {
	private int employeeID;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeEmail;
	private long employeePhno;
	private Employee createdBy;
	private Employee updatedBy;
	private Date createdDate;
	private Date updatedDate;
	private TrainingPrograms trainingPrograms;
	private Enrollment enrollment;
	private Feedback feedback;
	private Assessment assessment;

	public Employee(int employeeID, String employeeFirstName, String employeeLastName, String employeeEmail,
			long employeePhno, Employee createdBy, Employee updatedBy, Date createdDate, Date updatedDate,
			TrainingPrograms trainingPrograms, Enrollment enrollment, Feedback feedback, Assessment assessment) {
		super();
		this.employeeID = employeeID;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeEmail = employeeEmail;
		this.employeePhno = employeePhno;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.trainingPrograms = trainingPrograms;
		this.enrollment = enrollment;
		this.feedback = feedback;
		this.assessment = assessment;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public long getEmployeePhno() {
		return employeePhno;
	}

	public void setEmployeephno(long employeephno) {
		this.employeePhno = employeephno;
	}

	public Employee getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}

	public Employee getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Employee updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public TrainingPrograms getTrainingPrograms() {
		return trainingPrograms;
	}

	public void setTrainingPrograms(TrainingPrograms trainingPrograms) {
		this.trainingPrograms = trainingPrograms;
	}

	public Enrollment getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(Enrollment enrollment) {
		this.enrollment = enrollment;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public Assessment getAssessment() {
		return assessment;
	}

	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}

}
