package com.example.dbcommunication.controller;

import javax.validation.Valid;

import org.drucare.core.util.ResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbcommunication.bean.LabBeanReq;
import com.example.dbcommunication.service.LabService;
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
public class LabController {
	@Autowired
	private LabService labService;
	@Autowired
	private ImageingUtill imageingUtill;
	@ApiOperation(value = "This API is used fetch the records form faculty table")
	@PostMapping("fetchLabDetails")
	public ResponseEntity<ResponseMapper> fetchLabDetails(@Valid @RequestBody LabBeanReq labBeanReq) {

		return imageingUtill.responseEntityForFetchSuccess(labService.fetchLabDetails(labBeanReq));

	}
//this api is used to get lab Details
}
