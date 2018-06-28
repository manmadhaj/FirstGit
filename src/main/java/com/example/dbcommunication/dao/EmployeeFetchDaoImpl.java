package com.example.dbcommunication.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dbcommunication.bean.EmployeeFetchReq;
import com.example.dbcommunication.bean.EmployeeFetchRes;

@Repository
public class EmployeeFetchDaoImpl implements EmployeeFetchDao {
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<EmployeeFetchRes> empDataFetch(EmployeeFetchReq employeeFetchReq) {
		Map<String, Object> map = new HashMap<>();
		map.put("employee_id", employeeFetchReq.getEmployeeId());
		String QueryForFetch = "SELECT employee_id, employee_nm, employee_sal FROM practice_dev.employee WHERE employee_id=:employee_id";
		List<Map<String, Object>> data = namedParameterJdbcTemplate.queryForList(QueryForFetch, map);
		List<EmployeeFetchRes> employeeFetchRes = new ArrayList<>();
		for (Map<String, Object> result : data) {
			EmployeeFetchRes empRes = new EmployeeFetchRes();
			empRes.setEmployeeId((Integer) result.get("employee_id"));
			empRes.setEmployeeName((String) result.get("employee_nm"));
			empRes.setEmployeeSalary((String) result.get("employee_sal"));

			employeeFetchRes.add(empRes);

		}
		return employeeFetchRes;
	}

}
