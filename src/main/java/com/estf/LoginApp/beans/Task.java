package com.estf.LoginApp.beans;

public class Task {
	private String content;
	private int id;
	
	public Task() {
		super();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Task(String content, int id) {
		super();
		this.content = content;
		this.id = id;
	}
	
	
}
