package com.ilp03.entity;

import java.sql.Date;

public class Assessment {
	private int assessmentID;
	private int enrollmentID;
	private Date assessmentDate;
	private int assessmentScore;
	private int createdBy;
	private int updatedBy;
	private Date createdDate;
	private Date updatedDate;

	public Assessment(int assessmentID, int enrollmentID, Date assessmentDate, int assessmentScore, int createdBy,
			int updatedBy, Date createdDate, Date updatedDate) {
		super();
		this.assessmentID = assessmentID;
		this.enrollmentID = enrollmentID;
		this.assessmentDate = assessmentDate;
		this.assessmentScore = assessmentScore;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public Assessment() {

	}

	public int getAssessmentID() {
		return assessmentID;
	}

	public void setAssessmentID(int assessmentID) {
		this.assessmentID = assessmentID;
	}

	public int getEnrollmentID() {
		return enrollmentID;
	}

	public void setEnrollmentID(int enrollmentID) {
		this.enrollmentID = enrollmentID;
	}

	public Date getAssessmentDate() {
		return assessmentDate;
	}

	public void setAssessmentDate(Date assessmentDate) {
		this.assessmentDate = assessmentDate;
	}

	public int getAssessmentScore() {
		return assessmentScore;
	}

	public void setAssessmentScore(int assessmentScore) {
		this.assessmentScore = assessmentScore;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
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

}
