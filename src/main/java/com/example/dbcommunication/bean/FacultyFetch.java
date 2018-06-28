package com.example.dbcommunication.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/* The {@code Integer} class wraps a value of the primitive type
   {@code int} in an object. An object of type {@code Integer}
   contains a single field whose type is {@code int}.*/
@ApiModel
public class FacultyFetch {
	@ApiModelProperty(value="This field is mandatory to fill",required=true)
	private Integer facultyId;

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}
	

}
