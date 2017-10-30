package com.issuetracker.gdp.Model;

/*
import java.awt.List;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import com.issuetracker.gdp.Repository.AdminDAO;
import com.issuetracker.gdp.Repository.CommentsDAO;
import com.issuetracker.gdp.Repository.IssuesDAO;
import com.issuetracker.gdp.Repository.ProjectDAO;
import com.issuetracker.gdp.Repository.RoleDAO;
import com.issuetracker.gdp.Repository.UsersDAO;
*/
public class AppTesting {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		try {
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/issuetracker/gdp/services/beans.xml");// write
																													// the
																													// beans
																													// file
																													// here..
			
			//  IssuesDAO id = (IssuesDAO) ac.getBean("issuesDAO");
		//id.create(new Issues(1, issuetitle, issueDesc, projectid, roleid, users, datecreated, datemodified))
			 
			// AdminDAO ad = (AdminDAO) ac.getBean("AdminDao");

			/*
			 * if (ad.create(new Admin("Sruthi", "Goteti")) && ad.create(new
			 * Admin("Saikiran", "Goteti")) && ad.create(new Admin("Chaitanya", "Goteti"))
			 * && ad.create(new Admin("Revanth", "Goteti")) && ad.create(new
			 * Admin("Sainath", "Goteti")) && ad.create(new Admin("Ajith", "Goteti")) &&
			 * ad.create(new Admin("Vikas", "Goteti")))
			 * 
			 * {
			 * 
			 * System.out.println("Admin database Created"); }
			 * 
			 * else { System.out.println("not successfull"); }
			 */

			/*
			 * RoleDAO rd = (RoleDAO)ac.getBean("RoleDAO");
			 * 
			 * rd.create(new Role(2, "database admin")); rd.create(new Role(3,
			 * "documentation")); rd.create(new Role(4, "tester")); rd.create(new Role(5,
			 * "UI Implementer")); rd.create(new Role(6, "spfwtasre develoepr"));
			 * rd.create(new Role(7, "spfwtasre develoepr")); rd.create(new Role(8,
			 * "scrum master"));
			 */
/*
			UsersDAO ud = (UsersDAO) ac.getBean("UsersDAO");
		
	
			ud.create(new Users("chaitymturu", "cHAITANYA", "MOTURUi", new Timestamp(201313450), new Timestamp(2019)));
			ud.create(new Users("Sainathgula", "Sainath", "Gulla", new Timestamp(23450), new Timestamp(20129)));
			ud.create(new Users("revanthkviuri", "revanth", "kovuri", new Timestamp(201610), new Timestamp(2076)));
		}
*/
	/*	
			ProjectDAO pd = (ProjectDAO)ac.getBean("ProjectDao");
		pd.create(new Project(1, "Issue Tracking System", "Software for Educational purposes", new Role(), new Users(), new Timestamp(203459), new Timestamp(123459)));			
		*/
		/*
			CommentsDAO cd = (CommentsDAO) ac.getBean("CommentsDAO");
			cd.create(new Comments(new IssuesDAO().getIssues(1), "form tag not working", "Santosh", new Timestamp(120136), new Timestamp(320145)));
			*/
			
	/*		
		}
	
		catch (CannotGetJdbcConnectionException ex) {
			System.out.println("Unable to connect to database.");
		} catch (DataAccessException ex) { // clarity exception for data access
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
		}

		catch (Exception e) {

			System.out.println(e.getMessage());
		}
*/
		System.out.println("App is Running");
	}

}
