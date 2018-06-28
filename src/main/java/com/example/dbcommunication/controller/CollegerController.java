package com.example.dbcommunication.controller;

import org.drucare.core.util.AppServiceException;
import org.drucare.core.util.ResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbcommunication.CollegeBean;
import com.example.dbcommunication.service.CollegeService;
import com.example.dbcommunication.utill.ImageingUtill;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@ApiResponses(value = @ApiResponse(code = 403, message = "You are not an Authorized user please contact admin person") )

@RestController
public class CollegerController {

	@Autowired
	private CollegeService collegeService;
	@Autowired
	private ImageingUtill imageingUtill;

	@ApiOperation(value = "This API is used to get information about the college and department details in that college")
	@PostMapping("collegeInfo")
	public CollegeBean collegeInfo(@RequestBody CollegeBean collegeBean) {
 
		return collegeService.collegeInfo(collegeBean);
	}

	@ApiOperation(value = "This API is used to update the college details")
	@PostMapping("collegeDataUpdate")
	public CollegeBean collegeDataUpdate(@RequestBody CollegeBean collegeBean) throws AppServiceException {

		return collegeService.collegeDataUpdate(collegeBean);
	}

	@PostMapping("collegeDataUpdateNew")
	public ResponseEntity<ResponseMapper> fetchDataForDynamicFields(@RequestBody CollegeBean collegeBean)
			throws AppServiceException, JsonProcessingException {

		return imageingUtill.responseEntityForFetchSuccess(collegeService.collegeDataUpdate(collegeBean));
	}

}
