package com.example.dbcommunication.service;

import com.example.dbcommunication.CollegeBean;

public interface CollegeService {

	/*
	 * public CollegeBean collegeInfo(Integer collegeId, String collegeName,
	 * String location);
	 */

	public CollegeBean collegeInfo(CollegeBean collegeBean);

	public CollegeBean collegeDataUpdate(CollegeBean college);
}
