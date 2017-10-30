package com.issuetracker.gdp.Model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Issues {

	private int issueid2;
	private String issuetitle;
	private String issueDesc;
	private int projectid;
	private int roleid;
	private String users;
	private Timestamp datecreated;
	private Timestamp datemodified;

	
/*
	public Issues(int issueid, String issuetitle, String issueDesc,
			Project projectid, Role roleid, Users users,
			Date datecreated, Date datemodified) {
		super();
		this.issueid = issueid;
		this.issuetitle = issuetitle;
		this.issueDesc = issueDesc;
		this.projectid = projectid;
		this.roleid = roleid;
		this.users = users;
		this.datecreated = datecreated;
		this.datemodified = datemodified;
	}
	*/

	public Issues() {
		
	}




	

	public Issues(int issueid2, String issuetitle, String issueDesc, int projectid, int roleid, String users,
			Date datecreated, Date datemodified) {
		super();
		this.issueid2 = issueid2;
		this.issuetitle = issuetitle;
		this.issueDesc = issueDesc;
		this.projectid = projectid;
		this.roleid = roleid;
		this.users = users;
		this.datecreated = (Timestamp) datecreated;
		this.datemodified = (Timestamp) datemodified;
	}






	public int getIssueid2() {
		return issueid2;
	}

	public void setIssueid(int issueid2) {
		this.issueid2 = issueid2;
	}

	public String getIssuetitle() {
		return issuetitle;
	}

	public void setIssuetitle(String issuetitle) {
		this.issuetitle = issuetitle;
	}

	public String getIssueDesc() {
		return issueDesc;
	}

	public void setIssueDesc(String issueDesc) {
		this.issueDesc = issueDesc;
	}

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int string) {
		this.roleid = string;
	}

	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = (Timestamp) datecreated;
	}

	public Date getDatemodified() {
		return datemodified;
	}

	public void setDatemodified(Date datemodified) {
		this.datemodified = (Timestamp) datemodified;
	}

	@Override
	public String toString() {
		return "Issues [issueid=" + issueid2 + ", issuetitle=" + issuetitle
				+ ", issueDesc=" + issueDesc + ", projectid=" + projectid
				+ ", roleid=" + roleid + ", users=" + users + ", datecreated="
				+ datecreated + ", datemodified=" + datemodified + "]";
	}

}
