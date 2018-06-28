package com.example.dbcommunication.utill;

import org.springframework.stereotype.Component;
import org.drucare.core.util.ResponseMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * This class contains constant string literals which is used to give proper
 * user interactive messages also it have the utility methods for all cured
 * operations +ve and -ve cases.
 * 
 * 
 * @author Srinivas Nangana
 *
 */
@Component
public class ImageingUtill {

	public static final String DATA_SAVED_SUCCESSFULLY = "DATA SAVED SUCCESSFULLY";
	public static final String RES_CODE_SAV001 = "SAV001";
	public static final String UNABLE_TO_SAVE_DATA = "UNABLE TO SAVE DATA";
	public static final String RES_CODE_SAV002 = "SAV002";

	public static final String DATA_UPDATED_SUCCESSFULLY = "DATA UPDATED SUCCESSFULLY";
	public static final String RES_CODE_UPD001 = "UPD001";
	public static final String UNABLE_TO_UPDATE = "UNABLE TO UPDATE";
	public static final String RES_CODE_UPD002 = "UPD002";

	public static final String DATA_DELETED_SUCCESSFULLY = "DATA DELETED SUCCESSFULLY";
	public static final String RES_CODE_DEL001 = "DEL001";
	public static final String UNABLE_TO_DELETE = "UNABLE TO DELETE";
	public static final String RES_CODE_DEL002 = "DEL002";

	public static final String DATA_FETCH_SUCCESSFULLY = "DATA FETCHED SUCCESSFULLY";
	public static final String RES_CODE_FET001 = "FET001";
	public static final String UNABLE_TO_FETCH_DATE = "UNABLE TO FETCH DATA";
	public static final String RES_CODE_FET002 = "FET002";

	public static final String NO_DATA_FOUND = "RECORDS NOT FOUND";
	public static final String RES_CODE_DNF001 = "DNF001";

	public static final String OPERATION_FAILED_GENERIC_MESSAGE = "OPERATION FAILED";
	public static final String RES_CODE_OFG001 = "OFG001";

	public static final String REQUIRED_FIELDS_MISSING = "REQUIRED FIELDS MISSING";
	public static final String RES_CODE_RFM001 = "RFM001";

	public static final String LOG_STATUS_START = "START";
	public static final String LOG_STATUS_ERROR = "ERROR";
	public static final String LOG_STATUS_END = "END";

	public static final String RES_CODE_SUCCESS = "E200";
	public static final String RES_CODE_FAILURE = "E400";

	public static final String ORGANIZATION_ID = "org_Id";

	public static final String ORG_GRP_ID = "org_grp_id";

	public static final String CREATED_USR_ID = "created_usr_id";

	public static final String PATIENT_ID = "patient_id";
	public static final String HOS_PATIENT_ID = "hos_patient_id";
	public static final String PATIENT_VISIT_ID = "patient_visit_id";
	public static final String DOCTOR_ID = "doctor_id";
	public static final String ANALYSIS_REQUEST_TEST_ID = "analysis_request_test_id";

	/**
	 * This method is template for insert success response  
	 * 
	 * @param Object
	 * @return ResponseEntity<ResponseMapper>
	 * @author Srinivas Nangana
	 */
	public ResponseEntity<ResponseMapper> responseEntityForInsertSuccess(Object object) {
		ResponseMapper responseMapper = new ResponseMapper(RES_CODE_SUCCESS, DATA_SAVED_SUCCESSFULLY);
		responseMapper.addValidations(RES_CODE_SAV001, DATA_SAVED_SUCCESSFULLY);
		responseMapper.setData(object);
		return new ResponseEntity<>(responseMapper, HttpStatus.OK);

	}

	/**
	 * This method is template for insert Failure response  
	 * 
	 * @param Object
	 * @return ResponseEntity<ResponseMapper>
	 * @author Srinivas Nangana
	 */

	public ResponseEntity<ResponseMapper> responseEntityForInsertFailure(Object object) {
		ResponseMapper responseMapper = new ResponseMapper(RES_CODE_FAILURE, UNABLE_TO_SAVE_DATA);
		responseMapper.addValidations(RES_CODE_SAV002, UNABLE_TO_SAVE_DATA);
		responseMapper.setData(object);
		return new ResponseEntity<>(responseMapper, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	/**
	 * This method is template for Update Success response  
	 * 
	 * @param Object
	 * @return ResponseEntity<ResponseMapper>
	 * @author Srinivas Nangana
	 */
	public ResponseEntity<ResponseMapper> responseEntityForUpdateSuccess(Object object) {
		ResponseMapper responseMapper = new ResponseMapper(RES_CODE_SUCCESS, DATA_UPDATED_SUCCESSFULLY);
		responseMapper.addValidations(RES_CODE_UPD001, DATA_UPDATED_SUCCESSFULLY);
		responseMapper.setData(object);
		return new ResponseEntity<>(responseMapper, HttpStatus.OK);

	}

	/**
	 * This method is template for Update Failure response  
	 * 
	 * @param Object
	 * @return ResponseEntity<ResponseMapper>
	 * @author Srinivas Nangana
	 */
	public ResponseEntity<ResponseMapper> responseEntityForUpdateFailure(Object object) {
		ResponseMapper responseMapper = new ResponseMapper(RES_CODE_FAILURE, UNABLE_TO_UPDATE);
		responseMapper.addValidations(RES_CODE_UPD002, UNABLE_TO_UPDATE);
		responseMapper.setData(object);
		return new ResponseEntity<>(responseMapper, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	/**
	 * This method is template for Delete operation success response  
	 * 
	 * @param Object
	 * @return ResponseEntity<ResponseMapper>
	 * @author Srinivas Nangana
	 */
	public ResponseEntity<ResponseMapper> responseEntityForDeleteSuccess(Object object) {
		ResponseMapper responseMapper = new ResponseMapper(RES_CODE_SUCCESS, DATA_DELETED_SUCCESSFULLY);
		responseMapper.addValidations(RES_CODE_DEL001, DATA_DELETED_SUCCESSFULLY);
		responseMapper.setData(object);
		return new ResponseEntity<>(responseMapper, HttpStatus.OK);

	}

	/**
	 * This method is template for Delete Failure response  
	 * 
	 * @param Object
	 * @return ResponseEntity<ResponseMapper>
	 * @author Srinivas Nangana
	 */
	public ResponseEntity<ResponseMapper> responseEntityForDeleteFailure(Object object) {
		ResponseMapper responseMapper = new ResponseMapper(RES_CODE_FAILURE, UNABLE_TO_DELETE);
		responseMapper.addValidations(RES_CODE_DEL002, UNABLE_TO_DELETE);
		responseMapper.setData(object);
		return new ResponseEntity<>(responseMapper, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	/**
	 * This method is template for Fetch Success response  
	 * 
	 * @param Object
	 * @return ResponseEntity<ResponseMapper>
	 * @author Srinivas Nangana
	 */
	public ResponseEntity<ResponseMapper> responseEntityForFetchSuccess(Object object) {

		ResponseMapper responseMapper = new ResponseMapper(RES_CODE_SUCCESS, DATA_FETCH_SUCCESSFULLY);
		responseMapper.addValidations(RES_CODE_FET001, DATA_FETCH_SUCCESSFULLY);
		responseMapper.setData(object);
		return new ResponseEntity<>(responseMapper, HttpStatus.OK);

	}

	/**
	 * This method is template for Fetch Failure response  
	 * 
	 * @param Object
	 * @return ResponseEntity<ResponseMapper>
	 * @author Srinivas Nangana
	 */
	public ResponseEntity<ResponseMapper> responseEntityForFetchFailure(Object object) {
		ResponseMapper responseMapper = new ResponseMapper(RES_CODE_FAILURE, UNABLE_TO_FETCH_DATE);
		responseMapper.addValidations(RES_CODE_FET002, UNABLE_TO_FETCH_DATE);
		responseMapper.setData(object);
		return new ResponseEntity<>(responseMapper, HttpStatus.INTERNAL_SERVER_ERROR);

	}


	/**
	 * This method is template for fetch empty response  
	 * 
	 * @param Object
	 * @return ResponseEntity<ResponseMapper>
	 * @author Srinivas Nangana
	 */
	public ResponseEntity<ResponseMapper> responseEntityForFetchEithEmtyData(Object object) {

		ResponseMapper responseMapper = new ResponseMapper(RES_CODE_SUCCESS, NO_DATA_FOUND);
		responseMapper.addValidations(RES_CODE_DNF001, NO_DATA_FOUND);
		responseMapper.setData(object);
		return new ResponseEntity<>(responseMapper, HttpStatus.OK);

	}

}
