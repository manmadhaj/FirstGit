package com.example.dbcommunication;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class CollegeBean {
	
	private Integer collegeId;
	@ApiModelProperty(value="It is mendatory to fill the input", required=true)
	@NotNull
	private String collegeName;
	@ApiModelProperty(value="It is mendatory to fill the input", required=true)
	@NotNull
	private String location;
	@Valid
	private DepartmentBean department;

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public DepartmentBean getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentBean department) {
		this.department = department;
	}
}
