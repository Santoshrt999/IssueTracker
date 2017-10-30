package com.issuetracker.gdp.Controllers;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.issuetracker.gdp.Model.Admin;
import com.issuetracker.gdp.services.AdminService;

@Controller
public class HomeController {

	private AdminService adsev;
	
	
	public void setAdsev(AdminService adsev) {
		this.adsev = adsev;
	}


	@RequestMapping("/")
	public String showHome(Model model) {

		List<Admin> ad = adsev.getAdmins();
		model.addAttribute("admins", "TIffany");
		return "home";

	}

}
