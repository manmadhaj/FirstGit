package com.example.dbcommunication.bean;

import javax.enterprise.inject.Model;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

@Model
public class FacultyInsert {
	private String facultyName;
	@ApiModelProperty(value="This filed is mandatory to fill",required=true)
	@NotNull
	private String teaches;
	@ApiModelProperty(value="This filed is mandatory to fill",required=true)
	@NotNull
	private Integer experience;

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
