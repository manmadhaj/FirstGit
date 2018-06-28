package com.example.dbcommunication.bean;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class FacultyDeleteOperation {
	@ApiModelProperty(value="This field is mandatory to fill",required=true)
	@NotNull
	private Integer facultyId;

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

}
