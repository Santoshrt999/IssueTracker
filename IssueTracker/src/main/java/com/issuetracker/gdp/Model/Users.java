package com.issuetracker.gdp.Model;

import java.util.Date;

public class Users {
	
	private String username;
	private String fname;
	private String lname;
	private Date dateCreated;
	private Date dateModified;
	
	public Users(String username, String fname, String lname,
			Date dateCreated, Date dateModified) {
		super();
		this.username = username;
		this.fname = fname;
		this.lname = lname;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	@Override
	public String toString() {
		return "Username [username=" + username + ", fname=" + fname
				+ ", lname=" + lname + ", dateCreated=" + dateCreated
				+ ", dateModified=" + dateModified + "]";
	}
	

}
