package com.example.dbcommunication.dao;

import java.util.List;
import java.util.Map;

import com.example.dbcommunication.bean.CustomerIdReq;
import com.example.dbcommunication.bean.CustomerIdRes;

public interface CustomerIdDAO {
	public List<Map<String, Object>> customerDetails(CustomerIdReq customerIdReq);

	public List<CustomerIdRes> fatechCustomerDetails(CustomerIdReq customerIdReq);

}
