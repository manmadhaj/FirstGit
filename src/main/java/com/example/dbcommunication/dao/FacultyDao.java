package com.example.dbcommunication.dao;

import java.util.List;
import com.example.dbcommunication.bean.FacultyBean;
import com.example.dbcommunication.bean.FacultyDeleteOperation;
import com.example.dbcommunication.bean.FacultyDeleteRes;
import com.example.dbcommunication.bean.FacultyFetch;
import com.example.dbcommunication.bean.FacultyInsert;
import com.example.dbcommunication.bean.FacultyInsertRes;
import com.example.dbcommunication.bean.FacultyUpdate;
import com.example.dbcommunication.bean.FacultyUpdateRes;

public interface FacultyDao {

	public FacultyInsertRes facultyInfoInsert(FacultyInsert facultyInsert);

	public FacultyUpdateRes facultyInfoUpdate(FacultyUpdate facultyUpdate);

	public FacultyDeleteRes deleteFacultyDetails(FacultyDeleteOperation facultyDeleteOperation);

	public List<FacultyBean> selectFacultyDetails(FacultyFetch facultyFetch);

}
