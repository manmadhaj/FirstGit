package com.example.dbcommunication.dao;

import java.util.List;

import com.example.dbcommunication.bean.LabBeanReq;
import com.example.dbcommunication.bean.LabBeanRes;

public interface LabDao {
	public List<LabBeanRes> fetchLabDetails(LabBeanReq labBeanReq);

}
