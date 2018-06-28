package com.example.dbcommunication.controller;

import org.drucare.core.util.ResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbcommunication.bean.StudentBean;
import com.example.dbcommunication.service.StudentService;
import com.example.dbcommunication.utill.ImageingUtill;

import io.swagger.annotations.ApiOperation;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private ImageingUtill imageingUtill;

	@ApiOperation(value = "this api is used to collect info from student and store in db")
	@PostMapping("studentInfo")
	public ResponseEntity<ResponseMapper> studentInfo(@RequestBody StudentBean studentBean) {
	//	StudentBean bean = studentService.studentInfo(studentBean);
		return imageingUtill.responseEntityForFetchSuccess(studentService.studentInfo(studentBean));

	}

}
