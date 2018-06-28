package com.example.dbcommunication.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dbcommunication.bean.CustomerIdReq;
import com.example.dbcommunication.bean.CustomerIdRes;
import com.example.dbcommunication.dao.CustomerIdDAO;

@Service
public class CustomerIdServiceImpl implements CustomerIdService {
	@Autowired
	CustomerIdDAO customerIdDAOImpl;

	public List<Map<String, Object>> customerDetails(CustomerIdReq customerIdReq) {

		return customerIdDAOImpl.customerDetails(customerIdReq);
	}

	@Override
	public List<CustomerIdRes> customerDetailsRes(CustomerIdReq customerIdReq) {

		return customerIdDAOImpl.fatechCustomerDetails(customerIdReq);
	}

}
