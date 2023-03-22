package com.estf.LoginApp.business;

import java.util.List;

import com.estf.LoginApp.beans.Task;
import com.estf.LoginApp.dao.TaskDao;
import com.estf.LoginApp.dao.TaskDaoMemory;


public class DefaultServices implements Services{
	
	private static DefaultServices instance = null;
	public static DefaultServices getInstance() {
        if(instance==null)
            instance=new DefaultServices(new TaskDaoMemory());

        return instance;
    }
	private TaskDao taskDao;

    public DefaultServices(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    @Override
    public Task addTask(Task task) {
        return taskDao.insert(task);
    }

    @Override
    public Task deleteTask(Task task) {
        return taskDao.delete(task);
    }

    @Override
    public Task getTasks(int id) {
        return taskDao.get(id);
    }

    @Override
    public Task ordreTask(Task task) {
        return taskDao.ordre(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskDao.getAll();
    }
	

}
