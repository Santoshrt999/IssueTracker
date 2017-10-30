package com.issuetracker.gdp.Repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.issuetracker.gdp.Model.Comments;

@Component("CommentsDAO")
public class CommentsDAO {
	private NamedParameterJdbcTemplate jdbctemp;

	public NamedParameterJdbcTemplate getJdbctemp() {
		return jdbctemp;
	}
@Autowired
	public void setJdbctemp(DataSource jdbctemp) {
		this.jdbctemp = new NamedParameterJdbcTemplate(jdbctemp);
	}
	
public boolean create(Comments comments) {
	
	BeanPropertySqlParameterSource bps = new BeanPropertySqlParameterSource(comments);
	
	return jdbctemp.update("insert into comments(idcomments, issueid, CommentDesc, CommentBy, datecreated, datemodified) values(:idcomments, :issueid, :CommentDesc, :CommentBy,:datecreated, :datemodified)", bps)==1;

}
}
