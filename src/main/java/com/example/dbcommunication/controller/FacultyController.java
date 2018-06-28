package com.example.dbcommunication.controller;

import javax.validation.Valid;

import org.drucare.core.util.ResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbcommunication.bean.FacultyDeleteOperation;
import com.example.dbcommunication.bean.FacultyFetch;
import com.example.dbcommunication.bean.FacultyInsert;
import com.example.dbcommunication.bean.FacultyUpdate;
import com.example.dbcommunication.service.FacultyService;
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
public class FacultyController {
	@Autowired
	private FacultyService facultyService;
	@Autowired
	private ImageingUtill imageingUtill;

	@ApiOperation(value = "This API is used to insert faculty details into db table")
	@PostMapping("insertFacultyDetails")
	public ResponseEntity<ResponseMapper> insertFacultyDetails(@RequestBody @Valid FacultyInsert facultyInsert) {

		return imageingUtill.responseEntityForInsertSuccess(facultyService.facultyInfoInsert(facultyInsert));
	}

	@ApiOperation(value = "This API is used to update the faculty details in the db table ")
	@PostMapping("responseEntityForUpdateSuccess")
	public ResponseEntity<ResponseMapper> responseEntityForUpdateSuccess(
			@RequestBody @Valid FacultyUpdate facultyUpdate) {

		return imageingUtill.responseEntityForUpdateSuccess(facultyService.facultyInfoUpdate(facultyUpdate));
	}

	@ApiOperation(value = "This API is used to delete the records in the faculty table")
	@PostMapping("responseEntityForDeleteSuccess")
	public ResponseEntity<ResponseMapper> responseEntityForDeleteSuccess(
			@RequestBody @Valid FacultyDeleteOperation facultyDeleteOperation) {

		return imageingUtill
				.responseEntityForDeleteSuccess(facultyService.deleteFacultyDetails(facultyDeleteOperation));
	}

	@ApiOperation(value = "This API is used fetch the records form faculty table")
	@PostMapping("responseEntityForFetchSuccess")
	public ResponseEntity<ResponseMapper> responseEntityForFetchSuccess(
			@Valid @RequestBody FacultyFetch facultyFetch) {

		return imageingUtill.responseEntityForFetchSuccess(facultyService.selectFacultyDetails(facultyFetch));
	}

}
