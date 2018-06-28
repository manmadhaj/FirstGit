package com.example.dbcommunication.bean;

import javax.validation.constraints.NotNull;



import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class StudentBean {
	@ApiModelProperty(value="this field is mendatory to fill",required=true)
	@NotNull
	private Integer studentId;
	
	private String studentName;
	@ApiModelProperty(value="this is mandatory to fill",required=true)
	private String course;
	private String phoneNumber;
	private String aadharNumber; 

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
