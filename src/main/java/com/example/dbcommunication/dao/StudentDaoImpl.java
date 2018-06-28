package com.example.dbcommunication.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dbcommunication.bean.StudentBean;
@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public StudentBean studentInfo(StudentBean studentBean) {
		MapSqlParameterSource parameter =new MapSqlParameterSource();
		parameter.addValue("studentId", studentBean.getStudentId());
		parameter.addValue("studentName", studentBean.getStudentName());
		parameter.addValue("course", studentBean.getCourse());
		String insertStudentData="INSERT INTO PRACTICE_DEV.STUDENT_INFO( STUDENTID, STUDENTNAME,COURSE)VALUES (:studentId,:studentName,:course)";
		namedParameterJdbcTemplate.update(insertStudentData, parameter);
		
		
			//StudentBeanRes studentBeanRes=new StudentBeanRes();
//		studentBeanRes.setStudentId(studentBean.getStudentId());
//		studentBeanRes.setStudentName(studentBean.getStudentName());
//		studentBeanRes.setCourse(studentBean.getCourse());
		
		
		return studentBean ;
	}
//	public StudentBean studentInfoUpdate(StudentBean studentBean){
//		MapSqlParameterS
//		
//	}
	/*this dao is for implemented studentdao*/

}
