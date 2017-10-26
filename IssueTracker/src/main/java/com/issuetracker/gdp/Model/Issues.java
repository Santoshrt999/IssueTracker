package com.issuetracker.gdp.Model;

import java.util.Date;
import java.util.List;

public class Issues {

	private int issueid;
	private String issuetitle;
	private String issueDesc;
	private Project projectid;
	private Role roleid;
	private List<Users> users;
	private Date datecreated;
	private Date datemodified;

	public Issues(int issueid, String issuetitle, String issueDesc,
			Project projectid, Role roleid, List<Users> users,
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

	public int getIssueid() {
		return issueid;
	}

	public void setIssueid(int issueid) {
		this.issueid = issueid;
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

	public Project getProjectid() {
		return projectid;
	}

	public void setProjectid(Project projectid) {
		this.projectid = projectid;
	}

	public Role getRoleid() {
		return roleid;
	}

	public void setRoleid(Role roleid) {
		this.roleid = roleid;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public Date getDatemodified() {
		return datemodified;
	}

	public void setDatemodified(Date datemodified) {
		this.datemodified = datemodified;
	}

	@Override
	public String toString() {
		return "Issues [issueid=" + issueid + ", issuetitle=" + issuetitle
				+ ", issueDesc=" + issueDesc + ", projectid=" + projectid
				+ ", roleid=" + roleid + ", users=" + users + ", datecreated="
				+ datecreated + ", datemodified=" + datemodified + "]";
	}

}
