package com.issuetracker.gdp.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.issuetracker.gdp.Model.Role;
import com.issuetracker.gdp.Model.Users;

@Component("UsersDAO")
public class UsersDAO {
	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setJdbc(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Users> getUsers() {

		return jdbc.query("select * from users", new RowMapper<Users>() {

			public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
				Users user = new Users();
				user.setUsername(rs.getString("username"));
				user.setFname(rs.getString("Fname"));
				user.setLname(rs.getString("lname"));
				user.setDateCreated(rs.getTimestamp("dateCreated"));
				user.setDateModified(rs.getTimestamp("dateModified"));

				return user;
			}

		});
	}

	public Users  getUsersname(String username) {

		MapSqlParameterSource params = new MapSqlParameterSource(); //mapping is used for retrieving the value
		params.addValue("username", username);
		
		return jdbc.queryForObject("select * from users where username=:username", params, new RowMapper<Users>() {

			public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
				Users user = new Users();
				user.setUsername(rs.getString("username"));
				user.setFname(rs.getString("Fname"));
				user.setLname(rs.getString("lname"));
				user.setDateCreated(rs.getTimestamp("dateCreated"));
				user.setDateModified(rs.getTimestamp("dateModified"));

				return user;
			}

		});
	}

	public boolean create(Users user) {
		BeanPropertySqlParameterSource bps = new BeanPropertySqlParameterSource(user);
		return jdbc.update(
				"insert into users(username, FName, lname, dateCreated, dateModified) values(:username, :Fname, :lname, :dateCreated, :dateModified)",
				bps) == 1;

	}
}
