package com.dimri.aggregate.function.service;

import java.util.HashMap;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;


import java.util.Optional;

import com.dimri.aggregate.function.model.ITeacherReport;

public interface ReportService {
/*	public List<Answer> findAllAnswer();
	public Optional<Answer> findSingleAnswerById(long id);
	public List<User>  getTeacherList(String roleAdmin);
	public List<User>  getStudentList(String roleUser);
	public Long getTotalAnswer(String userName); //
*/	
	public List<ITeacherReport> getTeacherReport(String userName);
/*	public Optional<User> getTeacherInfo(String teacherName);
	public Optional<User> findByUserName(String userName);
	
	public Optional<User>getTeacherRecord(String teacherName);
*/
	
}

