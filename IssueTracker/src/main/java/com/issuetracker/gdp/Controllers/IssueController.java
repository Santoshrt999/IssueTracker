package com.issuetracker.gdp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class IssueController {

	
	
	
	
	@RequestMapping("/createissues")
	public String createIssues() {
		
		return "createissues";
		
	}
}
