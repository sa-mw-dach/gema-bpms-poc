package com.redhat.gema.mplus.usagereporting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "match")
public class WorkReport implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int id;
	private String workId;
	private String title;

	public WorkReport() {
	}

	public WorkReport(int id, String workId,  String title) {
		this.id = id;
		this.workId = workId;
		this.title = title;
	}

	@Id 
	@GeneratedValue
	@Column(name = "id")
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "WerkID")
	public String getWorkId() {
		return this.workId;
	}

	public void setWorkId(String workId) {
		this.workId = workId;
	}

	@Column(name = "Titel")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
