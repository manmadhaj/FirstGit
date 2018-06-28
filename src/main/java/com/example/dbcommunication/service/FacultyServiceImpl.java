package com.example.dbcommunication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbcommunication.bean.FacultyBean;
import com.example.dbcommunication.bean.FacultyDeleteOperation;
import com.example.dbcommunication.bean.FacultyDeleteRes;
import com.example.dbcommunication.bean.FacultyFetch;
import com.example.dbcommunication.bean.FacultyInsert;
import com.example.dbcommunication.bean.FacultyInsertRes;
import com.example.dbcommunication.bean.FacultyUpdate;
import com.example.dbcommunication.bean.FacultyUpdateRes;
import com.example.dbcommunication.dao.FacultyDao;

@Service
public class FacultyServiceImpl implements FacultyService {
	@Autowired
	private FacultyDao facultyDao;

	@Override
	public FacultyInsertRes facultyInfoInsert(FacultyInsert facultyInsert) {
		return facultyDao.facultyInfoInsert(facultyInsert);
	}

	@Override
	public FacultyUpdateRes facultyInfoUpdate(FacultyUpdate facultyUpdate) {
		return facultyDao.facultyInfoUpdate(facultyUpdate);
	}

	@Override
	public FacultyDeleteRes deleteFacultyDetails(FacultyDeleteOperation facultyDeleteOperation) {
		return facultyDao.deleteFacultyDetails(facultyDeleteOperation);
	}

	@Override
	public List<FacultyBean> selectFacultyDetails(FacultyFetch facultyFetch) {
		return facultyDao.selectFacultyDetails(facultyFetch);
	}

}
