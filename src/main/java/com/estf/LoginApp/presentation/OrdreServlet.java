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

/**
 * Servlet implementation class OrdreServlet
 */
@WebServlet("/ordreTask")
public class OrdreServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
    
    private Services services;
    
    public void init() {
        services = DefaultServices.getInstance();
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        String ordreStr = request.getParameter("ordre");
        if(idStr != null && !idStr.isEmpty() && ordreStr != null && !ordreStr.isEmpty()) {
            int id = Integer.parseInt(idStr);
            // find the task with the given id and update its order
            Task task = services.getTasks(id);
            if(task != null) {
                task.setId(id);
                services.ordreTask(task);
            }
        }
        response.sendRedirect(request.getContextPath() + "/ListTask");
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}
