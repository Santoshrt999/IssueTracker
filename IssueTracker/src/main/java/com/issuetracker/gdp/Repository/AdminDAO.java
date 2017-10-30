package com.issuetracker.gdp.Repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;


import com.issuetracker.gdp.Model.Admin;
@Component("AdminDao")
public class AdminDAO {

	private NamedParameterJdbcTemplate jdbc;
@Autowired
	public void setJdbc(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

public List<Admin> getAdmins() {

	return jdbc.query("select * from admin", new RowMapper<Admin>() {

		public Admin mapRow(ResultSet rs, int Rownum) throws SQLException {

			Admin admin = new Admin();
			admin.setAdminid(rs.getInt("Adminid"));
			admin.setAdminFname(rs.getString("AdminFname"));
			admin.setAdminLname(rs.getString("AdminLname"));

			return admin;
		}

	});
}



public boolean create(Admin admins) {
		BeanPropertySqlParameterSource bps = new BeanPropertySqlParameterSource(admins);
		return jdbc.update("insert into admin(AdminFname, AdminLname) values(:AdminFname, :AdminLname)", bps)==1;
		
		
	}
	
	
}
