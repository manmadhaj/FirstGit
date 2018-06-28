package com.example.dbcommunication.service;

import java.util.List;

import com.example.dbcommunication.bean.LabBeanReq;
import com.example.dbcommunication.bean.LabBeanRes;

public interface LabService {
	public List<LabBeanRes> fetchLabDetails(LabBeanReq labBeanReq);

}
