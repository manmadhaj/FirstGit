package com.example.dbcommunication.service;

import java.util.List;

import com.example.dbcommunication.bean.EmployeeFetchReq;
import com.example.dbcommunication.bean.EmployeeFetchRes;

public interface EmployeeFetchService {
	public List<EmployeeFetchRes>  empDataFetch(EmployeeFetchReq employeeFetchReq);
		
		
	

}
