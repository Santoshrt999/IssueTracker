package com.issuetracker.gdp.Model;

public class Admin {

	private int Adminid;
	private String AdminFname;
	private String AdminLname;

	
	public Admin(String adminFname, String adminLname) {
		
		AdminFname = adminFname;
		AdminLname = adminLname;
	}



	public Admin() {
		
	}



	public int getAdminid() {
		return Adminid;
	}

	public void setAdminid(int adminid) {
		Adminid = adminid;
	}

	public String getAdminFname() {
		return AdminFname;
	}

	public void setAdminFname(String adminFname) {
		AdminFname = adminFname;
	}

	public String getAdminLname() {
		return AdminLname;
	}

	public void setAdminLname(String adminLname) {
		AdminLname = adminLname;
	}

	@Override
	public String toString() {
		return "Admin [Adminid=" + Adminid + ", AdminFname=" + AdminFname
				+ ", AdminLname=" + AdminLname + "]";
	}

}
