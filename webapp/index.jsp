<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="style.css">
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
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
<%=request.getAttribute("message")==null?"":request.getAttribute("message") %>
	<h1>Welcome to your Account</h1>
<footer>
	copyright estf @2023
</footer>
</body>
</html>