package com.redhat.gema.mplus.usagenotification.model;

public class work extends java.lang.Object implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String author;
	private java.util.Date date;
	private java.lang.Integer duration;
	private java.lang.String title;

	public work() {
	}

	public work(java.lang.String title, java.lang.String author, java.util.Date date, java.lang.Integer duration) {
		this.title = title;
		this.author = author;
		this.date = date;
		this.duration = duration;
	}

	public java.lang.String getAuthor() {
		return this.author;
	}

	public void setAuthor(java.lang.String author) {
		this.author = author;
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public java.lang.Integer getDuration() {
		return this.duration;
	}

	public void setDuration(java.lang.Integer duration) {
		this.duration = duration;
	}

	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}
}
