package com.example.dbcommunication.bean;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel
public class EmployeeFetchReq {
	private Integer employeeId;
@ApiModelProperty(value="This field is mandatory to fill",required=true)
@NotNull
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

}
