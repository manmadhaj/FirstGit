package com.example.dbcommunication.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dbcommunication.bean.CustomerIdReq;
import com.example.dbcommunication.bean.CustomerIdRes;

@Repository
public class CustomerIdDAOImpl implements CustomerIdDAO {
	 NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<Map<String, Object>> customerDetails(CustomerIdReq customerIdReq) {

		String customerDetails = "select customer_id,customer_name from practice_dev.customers_table where customer_id=customerId";
		Map<String, Object> map = new HashMap<>();
		map.put("customerId", customerIdReq.getCustomerId());
		List<Map<String, Object>> list =queryForList(customerDetails, map);
		return list;

	}

	private List<Map<String, Object>> queryForList(String string, Map<String, Object> map) {
	
		return null;
	}

	@Value("${query.fatechCustomerDetails}")
	private String fatechCustomerDetails;         

	@Override
	public List<CustomerIdRes> fatechCustomerDetails(CustomerIdReq customerIdReq) {
		Map<String,Object> map=new HashMap<>();
		map.put("customerId", customerIdReq.getCustomerId());

		List<Map<String, Object>> customerDetails = namedParameterJdbcTemplate.queryForList("customerInfo", map);

		List<CustomerIdRes> customerIdRes = new ArrayList<>();

		for (Map<String, Object> dataMap : customerDetails) {

			CustomerIdRes customerRes = new CustomerIdRes();

			customerRes.setCustomerId((Integer) dataMap.get("customer_id"));
			customerRes.setCustomerName((String) dataMap.get("customer_name"));

			customerIdRes.add(customerRes);
		}

		return customerIdRes;
	}

}
