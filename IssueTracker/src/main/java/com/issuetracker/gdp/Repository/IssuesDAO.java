package com.issuetracker.gdp.Repository;




import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;


import com.issuetracker.gdp.Model.Issues;
import com.issuetracker.gdp.Model.Users;

@Component("issuesDAO")
public class IssuesDAO {
	
	private NamedParameterJdbcTemplate jdbctemp;

	public NamedParameterJdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(DataSource jdbctemp) {
		this.jdbctemp = new NamedParameterJdbcTemplate(jdbctemp);
	}




public boolean create(Issues issues) {
	
	BeanPropertySqlParameterSource bps = new BeanPropertySqlParameterSource(issues);
	
	return jdbctemp.update("insert into issues(idissues, issueTitle, roleid, projectid, username, issuesDesc, datecreated, datemodified) values(:idissues, :issueTitle, :roleid, :projectid, :username, :issuesDesc, :datecreated, :datemodified)", bps)==1;

}

public Issues getIssues(int id) {

	MapSqlParameterSource params = new MapSqlParameterSource();
	params.addValue("id", id);

	return jdbctemp.queryForObject("select * from issues where idissues=:idissues", params,
			new RowMapper<Issues>() {

				public Issues mapRow(ResultSet rs, int rowNum)
						throws SQLException {
					Issues issues=new Issues();

					issues.setIssueid(rs.getInt("idissues"));
					issues.setIssuetitle(rs.getString("issueTitle"));
				    issues.setDatecreated(rs.getTimestamp("datecreated"));
				    issues.setDatemodified(rs.getTimestamp("rs.datemodified"));
					issues.setIssueDesc(rs.getString("issuesDesc"));
					issues.setProjectid(rs.getInt("projectid"));
					issues.setUsers(rs.getString("username"));
					issues.setRoleid(rs.getInt("roleid"));
					

					return issues;
				}

			});

}
}
