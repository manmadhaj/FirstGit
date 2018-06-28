package com.example.dbcommunication.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dbcommunication.bean.LabBeanReq;
import com.example.dbcommunication.bean.LabBeanRes;

@Repository
public class LabDaoImpl implements LabDao {
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<LabBeanRes> fetchLabDetails(LabBeanReq labBeanReq) {

		Map<String, Object> map = new HashMap<>();
		String QueryForFetch = "select lrx.package_id, lrx.panel_id, lrx.test_id, lrx.org_id, lrx.technician_test_remarks,lrt.patient_id, lrt.hos_patient_id,"
				+ "lrt.patient_type, lht.macroscopic_description,lht.created_usr_id, lht.brief_clinical_history FROM lab.lab_analysis_request_test_xtrans lrx "
				+ "join lab.lab_analysis_request_trans lrt on lrx.org_id=lrt.org_id join lab.lab_biopsy_history_trans lht on lrx.org_id=lrx.org_id where lrx.org_grp_id=:org_grp_id ";

		map.put("org_grp_id", labBeanReq.getOrgGroupId());
		StringBuilder stringBuilder = new StringBuilder(QueryForFetch);

		if (true) {

			map.put("lrx.package_id", labBeanReq.getPackage_id());
			map.put("lrt.patient_id", labBeanReq.getPatient_id());
			stringBuilder.append(" or lrx.package_id=:lrx.package_id or lrt.patient_id=:lrt.patient_id  limit 100 ");
		}

		List<Map<String, Object>> data = namedParameterJdbcTemplate.queryForList(stringBuilder.toString(), map);
		List<LabBeanRes> labBeanResNew = new ArrayList<>();

		for (Map<String, Object> fetchResult : data) {
			LabBeanRes labBeanRes = new LabBeanRes();

			labBeanRes.setBriefClinicalHistory((Integer) fetchResult.get("brief_clinical_history_id"));
			labBeanRes.setCreatedUserId((Long) fetchResult.get("created_usr_id"));
			labBeanRes.setHosPatientId((String) fetchResult.get("hos_patient_id"));
			labBeanRes.setMacroscopicDescription((String) fetchResult.get("microscopic_description"));
			labBeanRes.setOrgGroupId((Integer) fetchResult.get("org_id"));
			labBeanRes.setPackageId((Long) fetchResult.get("package_id"));
			labBeanRes.setPanelId((Integer) fetchResult.get("panel_id"));
			labBeanRes.setPatientId((Long) fetchResult.get("patient_id"));
			labBeanRes.setPatientType((String) fetchResult.get("patient_type"));
			labBeanRes.setTechnicianTestRemarks((String) fetchResult.get("technician_text_remarks"));
			labBeanRes.setTestId((Integer) fetchResult.get("test_id"));

			labBeanResNew.add(labBeanRes);
		}
		return labBeanResNew;
	}

}
