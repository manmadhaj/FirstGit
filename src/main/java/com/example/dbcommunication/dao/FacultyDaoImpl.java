package com.example.dbcommunication.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.dbcommunication.bean.FacultyBean;
import com.example.dbcommunication.bean.FacultyDeleteOperation;
import com.example.dbcommunication.bean.FacultyDeleteRes;
import com.example.dbcommunication.bean.FacultyFetch;
import com.example.dbcommunication.bean.FacultyInsert;
import com.example.dbcommunication.bean.FacultyInsertRes;
import com.example.dbcommunication.bean.FacultyUpdate;
import com.example.dbcommunication.bean.FacultyUpdateRes;
import com.example.dbcommunication.exception.RecordNotFoundException;

@Repository
public class FacultyDaoImpl implements FacultyDao {
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public FacultyInsertRes facultyInfoInsert(FacultyInsert facultyInsert) {
		FacultyInsertRes facultyInsertRes=new FacultyInsertRes();
		MapSqlParameterSource parameter = new MapSqlParameterSource();
		parameter.addValue("facultyName", facultyInsert.getFacultyName());
		parameter.addValue("teaches", facultyInsert.getTeaches());
		parameter.addValue("experience", facultyInsert.getExperience());
		KeyHolder keyHolder = new GeneratedKeyHolder();
		facultyInsertRes.setExperience(facultyInsert.getExperience());
		facultyInsertRes.setFacultyName(facultyInsert.getFacultyName());
		facultyInsertRes.setTeaches(facultyInsert.getTeaches());
		String facultyInfoInsertQuery = "insert into practice_dev.faculty  (faculty_nm,subject_teaches,experience) values(:facultyName,:teaches,:experience)";
		namedParameterJdbcTemplate.update(facultyInfoInsertQuery, parameter, keyHolder, new String[] { "faculty_id" });
		Integer id=keyHolder.getKey().intValue();
		facultyInsertRes.setFacultyId(id);
		return facultyInsertRes;
	}
	@Override
	public FacultyUpdateRes facultyInfoUpdate(FacultyUpdate facultyUpdate) {
		MapSqlParameterSource parameter = new MapSqlParameterSource();
		FacultyUpdateRes facultyUpdateRes=new FacultyUpdateRes();
		parameter.addValue("faculty_id", facultyUpdate.getFacultyId());
		parameter.addValue("faculty_nm", facultyUpdate.getFacultyName());
		parameter.addValue("subject_teaches", facultyUpdate.getTeaches());
		parameter.addValue("experience", facultyUpdate.getExperience());
		String facultyInfoUpdateQuery = "update practice_dev.faculty set faculty_nm=:faculty_nm,subject_teaches=:subject_teaches,experience=:experience  WHERE faculty_id=:faculty_id";
		checkRecordsCountIfZeroRecordFoundThrowException(namedParameterJdbcTemplate.update(facultyInfoUpdateQuery, parameter));
		facultyUpdateRes.setMessage("Updated successfully");
		return facultyUpdateRes;
	}
	@Override
	public FacultyDeleteRes deleteFacultyDetails(FacultyDeleteOperation facultyDeleteOperation) {
		FacultyDeleteRes facultyDeleteRes=new FacultyDeleteRes();
		MapSqlParameterSource parameter = new MapSqlParameterSource();
		parameter.addValue("faculty_id", facultyDeleteOperation.getFacultyId());
		String deleteQuery = "delete from practice_dev.faculty where faculty_id=:faculty_id";
		checkRecordsCountIfZeroRecordFoundThrowException(namedParameterJdbcTemplate.update(deleteQuery, parameter));
		facultyDeleteRes.setMessage("Deleted Successfully");
		return facultyDeleteRes;
	}
	@Override
	public List<FacultyBean> selectFacultyDetails(FacultyFetch facultyFetch) {
		String selectQuery = "select faculty_id,faculty_nm,subject_teaches,experience from practice_dev.faculty where faculty_id=:faculty_id";
		Map<String, Object> map = new HashMap<>();
		
		map.put("faculty_id", facultyFetch.getFacultyId());
		List<Map<String,Object>> facultyDetails= namedParameterJdbcTemplate.queryForList(selectQuery, map);
		List<FacultyBean> facultyBean=new ArrayList<>();
		for(Map<String,Object> facultyData:facultyDetails){
			
			((FacultyBean) facultyBean).setFacultyId((Integer) facultyData.get("faculty_id"));
			((FacultyBean) facultyBean).setFacultyName((String) facultyData.get("faculty_nm"));
			((FacultyBean) facultyBean).setTeaches((String) facultyData.get("subject_teaches"));
			((FacultyBean) facultyBean).setExperience((String) facultyData.get("experience"));
			

			facultyBean.add((FacultyBean) facultyData);
			
		}
		return facultyBean;
		}
		public void checkRecordsCountIfZeroRecordFoundThrowException(int count){
			if(count==0){
				throw new RecordNotFoundException();
			}
		}

	}
	
