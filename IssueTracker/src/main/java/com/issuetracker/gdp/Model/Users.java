package com.issuetracker.gdp.Model;

import java.sql.Timestamp;


public class Users {
	
	private String username;
	private String fname;
	private String lname;
	private Timestamp dateCreated;
	private Timestamp dateModified;
	
	public Users() {
		//super();
	}
	public Users(String username, String fname, String lname,
			Timestamp dateCreated, Timestamp dateModified) {
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
	public Timestamp getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Timestamp getDateModified() {
		return dateModified;
	}
	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}
	@Override
	public String toString() {
		return "Username [username=" + username + ", fname=" + fname
				+ ", lname=" + lname + ", dateCreated=" + dateCreated
				+ ", dateModified=" + dateModified + "]";
	}
	

}
