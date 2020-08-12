package com.dimri.aggregate.function.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dimri.aggregate.function.model.Answer;
import com.dimri.aggregate.function.model.ITeacherReport;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
	


 
	@Query(value = "SELECT MONTH(answer_date) AS monthData, "
			+ "COUNT(answer_date) AS answerData, YEAR(answer_date) AS sessionYear "
			+ "from  (SELECT answer_date FROM answer WHERE teacher_name=?1) AS answer  "
			+ "GROUP BY MONTH(answer_date)",nativeQuery = true)
	public	List<ITeacherReport> getTeacherReport(String teacherName);
	

	}
