package com.example.dbcommunication.service;

import java.util.List;
import java.util.Map;

import com.example.dbcommunication.bean.CustomerIdReq;
import com.example.dbcommunication.bean.CustomerIdRes;

public interface CustomerIdService {
	public List<Map<String, Object>> customerDetails(CustomerIdReq customerIdReq);

	List<CustomerIdRes> customerDetailsRes(CustomerIdReq customerIdReq);
	/*this service is for customerId*/
//hello drucare
}

