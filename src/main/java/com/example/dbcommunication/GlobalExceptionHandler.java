package com.example.dbcommunication;

import org.drucare.core.util.ResponseMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.dbcommunication.exception.RecordNotFoundException;
import com.example.dbcommunication.utill.ImageingUtill;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseMapper> exceptionHandler(MethodArgumentNotValidException ex) {

		ex.printStackTrace();
		ResponseMapper responseMapper = new ResponseMapper(ImageingUtill.RES_CODE_FAILURE,
				ImageingUtill.REQUIRED_FIELDS_MISSING);
		responseMapper.addValidations(ImageingUtill.RES_CODE_RFM001, ImageingUtill.REQUIRED_FIELDS_MISSING);

		return new ResponseEntity<ResponseMapper>(responseMapper, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseMapper> exceptionHandler(Exception ex) {

		ex.printStackTrace();
		ResponseMapper responseMapper = new ResponseMapper(ImageingUtill.RES_CODE_FAILURE,
				ImageingUtill.OPERATION_FAILED_GENERIC_MESSAGE);
		responseMapper.addValidations(ImageingUtill.RES_CODE_OFG001, ImageingUtill.OPERATION_FAILED_GENERIC_MESSAGE);

		return new ResponseEntity<ResponseMapper>(responseMapper, HttpStatus.INTERNAL_SERVER_ERROR);

	}
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<ResponseMapper> recordNotFoundExceptionHandler(RecordNotFoundException ex) {

		ex.printStackTrace();
		ResponseMapper responseMapper = new ResponseMapper(ImageingUtill.RES_CODE_DNF001,
				ImageingUtill.NO_DATA_FOUND);
		responseMapper.addValidations(ImageingUtill.RES_CODE_DNF001, ImageingUtill.NO_DATA_FOUND);

		return new ResponseEntity<ResponseMapper>(responseMapper, HttpStatus.OK);

	}

}
