package com.redhat.gema.mplus.usagenotification.model;

import java.util.Date;

public class work implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private String author = "";
	private Date date;
	private Integer duration;
	private String title = "";

	public work() {
	}

	public work(String title, String author, java.util.Date date, Integer duration) {
		this.title = title;
		this.author = author;
		this.date = date;
		this.duration = duration;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
