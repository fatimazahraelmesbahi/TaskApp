<%@page import="com.estf.LoginApp.beans.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="style.css">
<%List<Task> tasks= (List<Task>) request.getAttribute("tasks"); %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
	<h1>
		Todo App
	</h1>
	<nav>
		<ul>
			<li> <a href="index.jsp">Accueil</a> </li>
			<li> <a href="AddTask">Add Task</a> </li>
			<li> <a href="ListTask">Liste</a> </li>
		</ul>
	</nav>
</header>
<h1>List of Tasks</h1>
	<table>
	<thead>
		<tr>
			<th>id</th>
			<th>title</th>
			<th>completed</th>
			<th>options</th>
		</tr>
	</thead>
	<tbody>
		<%for(Task task:tasks){ %>
			<tr>
				<td><%=task.getId() %></td>
				<td><%=task.getContent()%></td>
				<td><a href="deleteTask?id=<%=task.getId() %>">X</a></td>
				<td><a href="ordreTask?id=<%=task.getId() %>">^</a></td>
			</tr>
		<%} %>
	</tbody>
</table>
<footer>
	copyright estf @2023
</footer>
</body>
</body>
</html>