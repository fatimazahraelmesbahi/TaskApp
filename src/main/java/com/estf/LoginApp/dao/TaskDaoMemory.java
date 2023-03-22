package com.estf.LoginApp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.estf.LoginApp.beans.Task;

public class TaskDaoMemory implements TaskDao{


    private List<Task> taskList = new ArrayList<>();
    private int nextId = 1;
    public TaskDaoMemory() {
        taskList=new Vector<Task>();
        insert(new Task("Hello",1));
        insert(new Task("Hello",2));
    }
    @Override
    public Task insert(Task task) {
        task.setId(nextId++);
        taskList.add(task);
        return task;
    }

    @Override
    public Task ordre(Task task) {
        // implement code to update the order of a task
        return task;
    }

    @Override
    public Task delete(Task task) {
        taskList.remove(task);
        return task;
    }

    @Override
    public Task get(int id) {
        int index = taskList.indexOf(id);
        if (index >= 0) {
            return taskList.get(index);
        } else {
            return null;
        }
    }

    @Override
    public List<Task> getAll() {
        return new ArrayList<>(taskList);
    }


	
}
