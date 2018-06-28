package com.example.dbcommunication.bean;

public class LabBeanRes {
	private Long packageId;
	private Integer panelId;
	private Integer testId;
	private Integer orgGroupId;
	private Long patientId;
	private String hosPatientId;
	private String patientType;
	private String macroscopicDescription;
	private String technicianTestRemarks;
	private Long createdUserId;
	private Integer briefClinicalHistory;

	
	public String getTechnicianTestRemarks() {
		return technicianTestRemarks;
	}

	public void setTechnicianTestRemarks(String technicianTestRemarks) {
		this.technicianTestRemarks = technicianTestRemarks;
	}


	public String getMacroscopicDescription() {
		return macroscopicDescription;
	}

	public void setMacroscopicDescription(String macroscopicDescription) {
		this.macroscopicDescription = macroscopicDescription;
	}



	

public	Long getCreatedUserId() {
		return createdUserId;
	}

public	void setCreatedUserId(Long createdUserId) {
		this.createdUserId = createdUserId;
	}

	public Long getPackageId() {
		return packageId;
	}

	public void setPackageId(Long packageId) {
		this.packageId = packageId;
	}

	public Integer getPanelId() {
		return panelId;
	}

	public void setPanelId(Integer panelId) {
		this.panelId = panelId;
	}

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}



	Integer getOrgGroupId() {
		return orgGroupId;
	}

	public void setOrgGroupId(Integer orgGroupId) {
		this.orgGroupId = orgGroupId;
	}

	Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}



	public String getHosPatientId() {
		return hosPatientId;
	}

	public void setHosPatientId(String hosPatientId) {
		this.hosPatientId = hosPatientId;
	}

	public String getPatientType() {
		return patientType;
	}

	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}

	

	public Integer getBriefClinicalHistory() {
		return briefClinicalHistory;
	}

	public void setBriefClinicalHistory(Integer briefClinicalHistory) {
		this.briefClinicalHistory = briefClinicalHistory;
	}

}
