package com.dimri.aggregate.function.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dimri.aggregate.function.model.ITeacherReport;
import com.dimri.aggregate.function.repository.AnswerRepository;



@Service
public class ReportServiceImpl implements  ReportService {
	
	@Autowired
	AnswerRepository answerRepository;
	
	
	@Override
	public List<ITeacherReport> getTeacherReport(String userName) {
		return answerRepository.getTeacherReport(userName);
	}


	
	
}
