package com.example.dbcommunication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbcommunication.bean.LabBeanReq;
import com.example.dbcommunication.bean.LabBeanRes;
import com.example.dbcommunication.dao.LabDao;
@Service
public class LabServiceImpl implements LabService {
	@Autowired
	private LabDao labDao;

	@Override
	public List<LabBeanRes> fetchLabDetails(LabBeanReq labBeanReq) {

		return labDao.fetchLabDetails(labBeanReq);
	}
}
