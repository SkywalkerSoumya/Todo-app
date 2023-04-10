package com.firstproj.checktask.checkmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="storage")
public class CheckModel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String task;
	@Column
	private boolean chk;
	@Column
	private String date;
	
	public CheckModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CheckModel(String task, boolean chk) {
		super();
		this.task = task;
		this.chk = chk;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public boolean isChk() {
		return chk;
	}
	public void setChk(boolean chk) {
		this.chk = chk;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
