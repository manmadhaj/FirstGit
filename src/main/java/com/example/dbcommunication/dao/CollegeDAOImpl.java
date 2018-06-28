package com.example.dbcommunication.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.dbcommunication.CollegeBean;

@Repository
public class CollegeDAOImpl implements CollegeDAO {
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public CollegeBean collegeInfo(CollegeBean collegeBean) {

		MapSqlParameterSource parameter = new MapSqlParameterSource();
		parameter.addValue("collegeName", collegeBean.getCollegeName());
		parameter.addValue("location", collegeBean.getLocation());
		KeyHolder keyHolder = new GeneratedKeyHolder();
		String queryForInsertCollegeData = "INSERT INTO PRACTICE_DEV.COLLEGE( COLLEGENAME, COLLEGELOCATION)VALUES (:collegeName,:location)";
		namedParameterJdbcTemplate.update(queryForInsertCollegeData, parameter, keyHolder, new String[] { "collegeid" });
		Integer collegeId = keyHolder.getKey().intValue();
		collegeBean.setCollegeId(collegeId);
		collegeBean.getDepartment().setCollegeId(collegeId);

		parameter.addValue("departmentHeadName", collegeBean.getDepartment().getDepartmentHeadName());
		parameter.addValue("departmentName", collegeBean.getDepartment().getDepartmentName());
		parameter.addValue("collegeId", collegeBean.getDepartment().getCollegeId());

		KeyHolder keyHolderNew = new GeneratedKeyHolder();

		String insertDepartMent = "INSERT INTO PRACTICE_DEV.DEPARTMENT(DEPTNAME, DEPTHEADNAME, COLLEGEID)VALUES (:departmentName, :departmentHeadName,:collegeId)";
		namedParameterJdbcTemplate.update(insertDepartMent, parameter, keyHolderNew, new String[] { "deptid" });
		collegeBean.getDepartment().setDepartmentId(keyHolderNew.getKey().intValue());
		return collegeBean;
	}
	
	

	public CollegeBean collegeDataUpdate(CollegeBean collegeBean) {
		MapSqlParameterSource newParameter = new MapSqlParameterSource();
		newParameter.addValue("collegeName", collegeBean.getCollegeName());
		newParameter.addValue("collegeLocation", collegeBean.getLocation());
		newParameter.addValue("collegeId", collegeBean.getCollegeId());
		String updateQuery = "UPDATE PRACTICE_DEV.COLLEGE SET COLLEGENAME=:collegeName,COLLEGELOCATION=:collegeLocation WHERE COLLEGEID=:collegeId";

		namedParameterJdbcTemplate.update(updateQuery, newParameter);
		return collegeBean;

	}
	/*
	 * public void temp() { MapSqlParameterSource parameter = new
	 * MapSqlParameterSource(); parameter.addValue("paramName", "value");
	 * KeyHolder keyHolder = new GeneratedKeyHolder(); int nb =
	 * namedParameterJdbcTemplate.update(
	 * "insert into practice_dev.college values()", parameters, keyHolder, new
	 * String[] { "collegeId" }); Integer generatedId =
	 * keyHolder.getKey().intValue(); }
	 */

	/*
	 * @Override public CollegeBean collegeInfo(Integer collegeId, String
	 * collegeName, String location) {
	 * 
	 * return null; }
	 */}
