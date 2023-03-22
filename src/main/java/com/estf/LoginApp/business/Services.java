package com.estf.LoginApp.business;

import java.util.List;

import com.estf.LoginApp.beans.Task;


public interface Services {

	public Task addTask(Task task);
    public Task deleteTask(Task task);
    public Task getTasks(int id);
    public Task ordreTask (Task task);
    public List<Task> getAllTasks();
}
