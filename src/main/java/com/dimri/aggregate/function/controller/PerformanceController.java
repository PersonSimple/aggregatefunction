package com.dimri.aggregate.function.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dimri.aggregate.function.model.ITeacherReport;
import com.dimri.aggregate.function.service.ReportServiceImpl;

@Controller
public class PerformanceController {
	
	@Autowired
	private ReportServiceImpl  reportService;


	@GetMapping("/performance")
	    public String getTotalAndMonthCount(@RequestParam String teacherName,Model model) {
	        List<ITeacherReport> totalAnser = reportService.getTeacherReport(teacherName);
	        model.addAttribute("totalAnswer",totalAnser);
	        return "countExample";
	    }

}
