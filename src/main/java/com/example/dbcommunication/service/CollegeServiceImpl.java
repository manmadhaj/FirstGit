package com.example.dbcommunication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dbcommunication.CollegeBean;
import com.example.dbcommunication.dao.CollegeDAO;

@Service
public class CollegeServiceImpl implements CollegeService {
	@Autowired
	private CollegeDAO collegeDAO;

	/*
	 * public CollegeBean collegeInfo(Integer collegeId, String collegeName,
	 * String location) {
	 * 
	 * return collegeDAO.collegeInfo(collegeId, collegeName, location); }
	 */

	@Override
	public CollegeBean collegeInfo(CollegeBean collegeBean) {
		return collegeDAO.collegeInfo(collegeBean);
		
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public CollegeBean collegeDataUpdate(CollegeBean collegeBean) {

		return collegeDAO.collegeDataUpdate(collegeBean);
	}

}
