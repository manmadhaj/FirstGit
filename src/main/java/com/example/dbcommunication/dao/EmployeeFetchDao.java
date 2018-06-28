package com.example.dbcommunication.dao;

import java.util.List;

import com.example.dbcommunication.bean.EmployeeFetchReq;
import com.example.dbcommunication.bean.EmployeeFetchRes;

public interface EmployeeFetchDao {
	public  List<EmployeeFetchRes> empDataFetch(EmployeeFetchReq employeeFetchReq);

}
