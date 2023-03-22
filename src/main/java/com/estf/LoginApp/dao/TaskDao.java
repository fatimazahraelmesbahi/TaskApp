package com.estf.LoginApp.dao;

import java.util.List;

import com.estf.LoginApp.beans.Task;



public interface TaskDao {
	public Task insert (Task task);
    public Task ordre (Task task);
    public Task delete (Task task);
    public Task get (int id);
    public List<Task> getAll();
}
