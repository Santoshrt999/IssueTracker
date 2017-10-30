package com.issuetracker.gdp.Repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.issuetracker.gdp.Model.Admin;
import com.issuetracker.gdp.Model.Role;
@Component("RoleDAO")
public class RoleDAO {
	private NamedParameterJdbcTemplate jdbc;
	@Autowired
		public void setJdbc(DataSource jdbc) {
			this.jdbc = new NamedParameterJdbcTemplate(jdbc);
		}

	
	public boolean create(Role role) {
		BeanPropertySqlParameterSource bps = new BeanPropertySqlParameterSource(role);
		return jdbc.update("insert into role(roleid, roleDesc) values(:roleid, :roleDesc)", bps)==1;
		
		
	}
	
}
