package com.issuetracker.gdp.Model;

import java.util.Date;
import java.util.List;



public class Assigneeid {
	private int assigneeid;
	private Project projectid;
	private Role roleid;
	private List<Users> users;
	private Date datecreated;
	private Date datemodified;
	public Assigneeid(int assigneeid, Project projectid, Role roleid,
			List<Users> users, Date datecreated, Date datemodified) {
		super();
		this.assigneeid = assigneeid;
		this.projectid = projectid;
		this.roleid = roleid;
		this.users = users;
		this.datecreated = datecreated;
		this.datemodified = datemodified;
	}
	public int getAssigneeid() {
		return assigneeid;
	}
	public void setAssigneeid(int assigneeid) {
		this.assigneeid = assigneeid;
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
	public List<Users> getUsername() {
		return users;
	}
	public void setUsername(List<Users> users) {
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
		return "Assigneeid [assigneeid=" + assigneeid + ", projectid="
				+ projectid + ", roleid=" + roleid + ", username=" + users
				+ ", datecreated=" + datecreated + ", datemodified="
				+ datemodified + "]";
	}
	
	

}
