package com.example.dbcommunication.bean;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class FacultyUpdate {
	@ApiModelProperty(value="This field is mandatory to fill to update the details",required=true)
	@NotNull
	private Integer facultyId;
	
	private String facultyName;
	@ApiModelProperty(value="This field is mandatory to fill",required=true)
	private String teaches;
	@ApiModelProperty(value="This field is mandatory to fill",required=true)
	private Integer experience;

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getTeaches() {
		return teaches;
	}

	public void setTeaches(String teaches) {
		this.teaches = teaches;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

}
