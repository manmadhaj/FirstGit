package com.example.dbcommunication.bean;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class LabBeanReq {
	
	@ApiModelProperty(value="this field is mandatory",required=true)
	@NotNull
	private Integer orgGroupId;
	@ApiModelProperty(value="mandatory",required=true)
	@NotNull
	private Long package_id;
	@ApiModelProperty(value="mandatory",required=true)
	@NotNull
	private Long patient_id;

	public Long getPackage_id() {
		return package_id;
	}

	public void setPackage_id(Long package_id) {
		this.package_id = package_id;
	}



	public Long getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(Long patient_id) {
		this.patient_id = patient_id;   
	}

	public Integer getOrgGroupId() {
		return orgGroupId;
	}

/*	@Override
	public String toString() {
		return "LabBeanReq [orgGroupId=" + orgGroupId + "]";
	}
*/
	void setOrgGroupId(Integer orgGroupId) {
		this.orgGroupId = orgGroupId;
	}

	/*@Override
	public String toString() {
		return "LabBeanReq [orgGroupId=" + orgGroupId + ", package_id=" + package_id + ", patient_id=" + patient_id
				+ "]";
	}*/


}

