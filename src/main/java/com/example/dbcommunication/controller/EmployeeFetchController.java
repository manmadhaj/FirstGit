package com.example.dbcommunication.controller;

import javax.validation.Valid;

import org.drucare.core.util.ResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbcommunication.bean.EmployeeFetchReq;
import com.example.dbcommunication.service.EmployeeFetchService;
import com.example.dbcommunication.utill.ImageingUtill;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@ApiResponses(value = {
		@ApiResponse(code = 403, message = "You are not an Authorized user please contact admin person"),
		@ApiResponse(code = 404, message = "GateWay not fond"),
		@ApiResponse(code = 500, message = "Internal Server Problem"),
		@ApiResponse(code = 200, message = "Operation Successfull") })
@RestController
public class EmployeeFetchController {
	@Autowired
	private EmployeeFetchService employeeFetchService;
	@Autowired
	private ImageingUtill imageingUtill;

	@ApiOperation("This API is used to get details of employee from the emploee table ")
	@PostMapping("empDataFetch")
	public ResponseEntity<ResponseMapper> empDataFetch(@Valid @RequestBody EmployeeFetchReq employeeFetchReq) {

		return imageingUtill.responseEntityForInsertSuccess(employeeFetchService.empDataFetch(employeeFetchReq));
	}

}
