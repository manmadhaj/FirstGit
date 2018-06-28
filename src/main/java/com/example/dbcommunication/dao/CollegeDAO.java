package com.example.dbcommunication.dao;

import com.example.dbcommunication.CollegeBean;

public interface CollegeDAO {

	/*public CollegeBean collegeInfo(Integer collegeId, String collegeName, String location);*/

	public CollegeBean collegeInfo(CollegeBean collegeBean);
	public CollegeBean collegeDataUpdate(CollegeBean collegeBean);
}
