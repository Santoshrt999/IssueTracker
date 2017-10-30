package com.issuetracker.gdp.Model;

public class Role {

	private int roleid;
	private String roleDesc;

	

	
	



	public Role(int roleid, String roleDesc) {
		super();
		this.roleid = roleid;
		this.roleDesc = roleDesc;
	}



	public Role() {
		super();
	}



	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	@Override
	public String toString() {
		return "Role [roleid=" + roleid + ", roleDesc=" + roleDesc + "]";
	}
}
