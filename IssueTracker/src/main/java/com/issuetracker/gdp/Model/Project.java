package com.issuetracker.gdp.Model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Project {
//Added the list of user code after creating the class. look for bugs
	private int projectid;
	private String projectTitle;
	private String projectDesc;
	private Role roleid;
	private Users users;
	private Timestamp dateCreated;
	private Timestamp dateModified;
	public Project(int projectid, String projectTitle, String projectDesc,
			Role roleid, Users users2, Timestamp dateCreated, Timestamp dateModified) {
	
		this.projectid = projectid;
		this.projectTitle = projectTitle;
		this.projectDesc = projectDesc;
		this.roleid = roleid;
		this.users = users2;
		this.dateCreated = dateCreated;
		this.dateModified =  dateModified;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjecttitle(String projectTitle) {
		this.projectTitle = projectTitle;
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
		this.users = (Users) users;
	}
	public Date getDatecreated() {
		return dateCreated;
	}
	public void setDatecreated( Timestamp dateCreated) {
		this.dateCreated =  dateCreated;
	}
	public Date getDatemodified() {
		return dateModified;
	}
	public void setDatemodified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}
	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", projecttitle="
				+ projectTitle + ", projectDesc=" + projectDesc + ", roleid="
				+ roleid + ", username=" + users + ", dateCreated="
				+ dateCreated + ", datemodified=" + dateModified + "]";
	}
	
	
	
}
