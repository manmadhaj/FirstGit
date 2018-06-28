package com.example.dbcommunication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbcommunication.bean.StudentBean;
import com.example.dbcommunication.dao.StudentDao;
import com.example.dbcommunication.service.StudentService;

@Service
public class StudentServiceImpli implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public StudentBean studentInfo(StudentBean studentBean) {

		return studentDao.studentInfo(studentBean);
	}

}
