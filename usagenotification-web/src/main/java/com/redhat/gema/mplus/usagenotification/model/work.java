package com.redhat.gema.mplus.usagenotification.model;

public class work implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private String author = "";
	private String date = null;
	private String duration = "";
	private String title = "";

	public work() {
	}

	public work(String title, String author, String date, String duration) {
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

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
