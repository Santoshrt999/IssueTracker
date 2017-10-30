package com.issuetracker.gdp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.issuetracker.gdp.Model.Admin;
import com.issuetracker.gdp.Repository.AdminDAO;

@Service("AdminService")
public class AdminService {
	
	private AdminDAO admindao;

	public void setAdmindao(AdminDAO admindao) {
		this.admindao = admindao;
	}
	
	public List<Admin> getAdmins(){
		
		return admindao.getAdmins();
	}

}
