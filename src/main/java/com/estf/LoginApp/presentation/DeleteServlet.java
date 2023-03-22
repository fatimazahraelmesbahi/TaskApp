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
import com.estf.LoginApp.dao.TaskDao;
import com.estf.LoginApp.dao.TaskDaoMemory;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/deleteTask")
public class DeleteServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
    
    private Services services;
    
    public void init() {
        services = DefaultServices.getInstance();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        if(idStr != null && !idStr.isEmpty()) {
            int id = Integer.parseInt(idStr);
            Task task = services.getTasks(id);
            if(task != null) {
                services.deleteTask(task);
            }
        }
        response.sendRedirect(request.getContextPath() + "/ListTask");
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
