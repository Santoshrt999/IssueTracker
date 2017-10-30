package com.issuetracker.gdp.Model;

import java.sql.Timestamp;
import java.util.Date;

public class Comments {

	private int commentid;
	private Issues issueid;
	private String CommentDesc;
	private String CommentBy;
	private Timestamp datecreated;
	private Timestamp datemodified;



	public Comments(Issues issueid, String commentDesc, String commentBy, Date datecreated, Date datemodified) {
		//super();
		this.issueid = issueid;
		CommentDesc = commentDesc;
		CommentBy = commentBy;
		this.datecreated = (Timestamp) datecreated;
		this.datemodified = (Timestamp) datemodified;
	}

	public int getCommentid() {
		return commentid;
	}

	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}

	public Issues getIssueid() {
		return issueid;
	}

	public void setIssueid(Issues issueid) {
		this.issueid = issueid;
	}

	public String getCommentDesc() {
		return CommentDesc;
	}

	public void setCommentDesc(String commentDesc) {
		CommentDesc = commentDesc;
	}

	public String getCommentBy() {
		return CommentBy;
	}

	public void setCommentBy(String commentBy) {
		CommentBy = commentBy;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = (Timestamp) datecreated;
	}

	public Date getDatemodified() {
		return datemodified;
	}

	public void setDatemodified(Date datemodified) {
		this.datemodified = (Timestamp) datemodified;
	}

	@Override
	public String toString() {
		return "Comments [commentid=" + commentid + ", issueid=" + issueid
				+ ", CommentDesc=" + CommentDesc + ", CommentBy=" + CommentBy
				+ ", datecreated=" + datecreated + ", datemodified="
				+ datemodified + "]";
	}

}
