package com.estf.LoginApp.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estf.LoginApp.beans.Task;
import com.estf.LoginApp.business.DefaultServices;
import com.estf.LoginApp.business.Services;


@WebServlet("/AddTask")

public class AddTaskServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("AddTask.jsp").forward(request, response);
	}
	
    private Services services = DefaultServices.getInstance();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String content = request.getParameter("content");

        Task task = new Task();
        task.setContent(content);

        DefaultServices.getInstance().addTask(task);
        
        response.sendRedirect(request.getContextPath() + "/ListTask");
    }
	
}
