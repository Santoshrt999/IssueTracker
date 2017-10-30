package com.issuetracker.gdp.Repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.issuetracker.gdp.Model.Project;
@Component("ProjectDao")
public class ProjectDAO {
	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setJdbc(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public boolean create(Project project) {
		BeanPropertySqlParameterSource bps = new BeanPropertySqlParameterSource(project);
		return jdbc.update(
				"insert into project(projectid, projectTitle, projectDesc, roleid, username, dateCreated, dateModified) values(:projectid, :projectTitle, :projectDesc, :roleid, :username, :dateCreated, :dateModified)",
				bps) == 1;

	}
}
