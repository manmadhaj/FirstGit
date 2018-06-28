package com.example.dbcommunication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbcommunication.bean.EmployeeFetchReq;
import com.example.dbcommunication.bean.EmployeeFetchRes;
import com.example.dbcommunication.dao.EmployeeFetchDao;
@Service
public class EmployeeFetchServiceImpl implements EmployeeFetchService {
	@Autowired 
	private EmployeeFetchDao employeeFetchDao;

	@Override
	public List<EmployeeFetchRes> empDataFetch(EmployeeFetchReq employeeFetchReq) {
	
		return employeeFetchDao.empDataFetch(employeeFetchReq);
	}

}
