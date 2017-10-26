package com.issuetracker.gdp.Model;

import java.util.Date;
import java.util.List;

public class Project {
//Added the list of user code after creating the class. look for bugs
	private int projectid;
	private String projecttitle;
	private String projectDesc;
	private Role roleid;
	private List<Users> users;
	private Date datecreated;
	private Date datemodified;
	public Project(int projectid, String projecttitle, String projectDesc,
			Role roleid, Users users, Date datecreated, Date datemodified) {
		super();
		this.projectid = projectid;
		this.projecttitle = projecttitle;
		this.projectDesc = projectDesc;
		this.roleid = roleid;
		this.users = (List<Users>) users;
		this.datecreated = datecreated;
		this.datemodified = datemodified;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjecttitle() {
		return projecttitle;
	}
	public void setProjecttitle(String projecttitle) {
		this.projecttitle = projecttitle;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	public Role getRoleid() {
		return roleid;
	}
	public void setRoleid(Role roleid) {
		this.roleid = roleid;
	}
	public Users getUsername() {
		return (Users) users;
	}
	public void setUsername(Users users) {
		this.users = (List<Users>) users;
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
		return "Project [projectid=" + projectid + ", projecttitle="
				+ projecttitle + ", projectDesc=" + projectDesc + ", roleid="
				+ roleid + ", username=" + users + ", datecreated="
				+ datecreated + ", datemodified=" + datemodified + "]";
	}
	
	
	
}
