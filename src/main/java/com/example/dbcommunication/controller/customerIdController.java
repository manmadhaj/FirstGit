package com.example.dbcommunication.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbcommunication.bean.CustomerIdReq;
import com.example.dbcommunication.service.CustomerIdService;

@RestController
public class customerIdController {

	@Autowired
	CustomerIdService customerIdService;

	@PostMapping("details")
	public List<Map<String, Object>> customerDetails(@RequestBody CustomerIdReq customerIdReq) {

		return customerIdService.customerDetails(customerIdReq);
		
	}

}
